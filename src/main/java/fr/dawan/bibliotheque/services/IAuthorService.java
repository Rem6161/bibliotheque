package fr.dawan.bibliotheque.services;

import java.util.List;
import java.util.Optional;

import fr.dawan.bibliotheque.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fr.dawan.bibliotheque.dtos.AuthorDto;
import fr.dawan.bibliotheque.dtos.BookDto;
import fr.dawan.bibliotheque.entities.Book;
import fr.dawan.bibliotheque.repositories.BookRepository;
import jakarta.validation.Valid;

public interface IAuthorService {

	

	
	Author getById(long id);

	List<Author> getByName(String name);

	AuthorDto addAuthor(AuthorDto authorDto);
	/*

     Page<AuthorDto> getAll(Pageable page);
    List<AuthorDto> getByName(String name);
    
    void deleteById(long id);
    
    AuthorDto create(@Valid  AuthorDto dto);
    
    AuthorDto update(@Valid  AuthorDto dto,long id);
    *
    */
}
