package fr.dawan.bibliotheque.controller;

import org.springframework.http.MediaType;


import java.util.List;

import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.bibliotheque.entities.Book;
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
	 
	 

 	 

 	 
 	 
 	 
 	 /*
	  *
	  */

}
