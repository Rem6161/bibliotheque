package fr.dawan.bibliotheque.controller;

import ch.qos.logback.core.CoreConstants;
import fr.dawan.bibliotheque.dtos.BookDto;
import fr.dawan.bibliotheque.entities.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


import java.util.List;

import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import fr.dawan.bibliotheque.services.IBookService;
import lombok.extern.slf4j.Slf4j;

@Slf4j

@RestController
@RequestMapping("/api/book")
public class BookController {

	@Autowired
	private IBookService bookService;
	
	
	@GetMapping(value = "/{id:[0-4]}", produces =MediaType.APPLICATION_JSON_VALUE)
	 public List<Book> getById(		 
		@Parameter(description = "L'id de la marque", required = true)
		 @PathVariable long id) {
		 return bookService.getById(id);

	 }
	
	
	@GetMapping(value = "/{name:[A-Za-z]+}", produces = MediaType.APPLICATION_JSON_VALUE)
	//@GetMapping(value = "/{name:[A-Za-z]+}")
	public List<Book> getByName(@PathVariable String name) {
		return bookService.getByName(name);
	}
	
	
	 @GetMapping(value = "/all", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAll() {
		return bookService.getAll();
	}


	@PostMapping(value = "/add")//, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Book addBook(@RequestBody Book book) {
		//TODO Attention : A boook should not be added without an author
		System.out.println(book);
		return bookService.addBook(book);

	}
 	 

 	 
 	 
 	 
 	 /*
	  *
	  */

}
