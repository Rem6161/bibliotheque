package fr.dawan.bibliotheque.services;

import java.util.List;

import fr.dawan.bibliotheque.dtos.BookDto;
import fr.dawan.bibliotheque.entities.Book;
import jakarta.validation.Valid;

public interface IBookService {


	
    BookDto getById(long id);
    
    List<Book> getByName(String name);

    List<Book> getAll();

    BookDto addBook(BookDto bookDto);

    public BookDto updateBook(Long id, BookDto bookDto);

    void deleteById(long id);
    
    BookDto create(@Valid  BookDto bDto);

   // BookDto update(@Valid  BookDto dto);

    BookDto update( BookDto dto);
}
