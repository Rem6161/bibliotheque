package fr.dawan.bibliotheque.services;

import fr.dawan.bibliotheque.dtos.AuthorDto;
import fr.dawan.bibliotheque.entities.Author;
import fr.dawan.bibliotheque.entities.exceptions.IdNotFoundException;
import fr.dawan.bibliotheque.mappers.AuthorMapper;
import fr.dawan.bibliotheque.repositories.AuthorRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Transactional
@Validated
public class AuthorServiceImpl implements IAuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;

    //get author by id

    @Override
    @Transactional
    public Author getById(long id) {
        Author authors = authorRepository.findById(id).get();
        return authors;
        // OR simply return authorRepository.findById(id).get();
    }

    //Get author by name
    @Override
    @Transactional
    public List<Author> getByName(String name) {
        List<Author> authors = authorRepository.findByNameLike(name + "%");

        return authors;
    }


    //Add (POST method) an author to the database
    public AuthorDto addAuthor(AuthorDto authorDto) {

        //Convert a Dto to en Entity
        Author author = authorMapper.toEntity(authorDto);

        //Use the Entity Author to save in the database
        Author saveAuthor = authorRepository.saveAndFlush(author);

        //Convert the saved Entity back to a Dto
        AuthorDto resultDto = authorMapper.toDto(saveAuthor);

        return  resultDto;
    }


    //Update an author with id
    @Override
    public AuthorDto updateAuthor(AuthorDto  authorDto) {

        Author author = authorRepository.findById(authorDto.getId())
                .orElseThrow(() -> new IdNotFoundException("Author with " + authorDto.getId() + " not found"));

        authorMapper.update(authorDto, author);
        return authorMapper.toDto(authorRepository.save(author));
    }


    //Delete an author from database using his id
    @Override
    public void deleteById(long id) {
        if(authorRepository.removeById(id) == 0) {
            throw new IdNotFoundException();
        }

    }


}
