package fr.dawan.bibliotheque.services;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fr.dawan.bibliotheque.dtos.BookDto;
import fr.dawan.bibliotheque.entities.Book;
import jakarta.validation.Valid;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBookService {


	
    BookDto getById(long id);
    
    List<Book> getByName(String name);
    
    List<Book> getAll();

	public Book addBook(Book book);

    void deleteById(long id);
    
    BookDto create(@Valid  BookDto bDto);

    BookDto update(@Valid  BookDto dto,long id);


}
