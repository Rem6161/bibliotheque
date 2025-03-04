package fr.dawan.bibliotheque.services;

import fr.dawan.bibliotheque.entities.Author;
import fr.dawan.bibliotheque.mappers.AuthorMapper;
import fr.dawan.bibliotheque.repositories.AuthorRepository;
import jakarta.transaction.Transactional;
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

    @Override
    @Transactional
    public List<Author> getByName(String name) {
        List<Author> authors = authorRepository.findByName(name + "%");
        return authors;
    }
}
