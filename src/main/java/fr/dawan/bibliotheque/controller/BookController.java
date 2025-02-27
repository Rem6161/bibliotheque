package fr.dawan.bibliotheque.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.dawan.bibliotheque.dtos.BookDto;
import fr.dawan.bibliotheque.entities.Book;
import org.springframework.http.MediaType;
import java.io.IOException;

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

	@Autowired
	private ObjectMapper objectMapper;

	// find a book by id
	@GetMapping(value = "/{id:[0-4]}", produces =MediaType.APPLICATION_JSON_VALUE)
	 public BookDto getById(
		@Parameter(description = "L``id de la marque", required = true)
		 @PathVariable long id) {
		 return bookService.getById(id);

	 }
	
	// FInd a book by name
	@GetMapping(value = "/{name:[A-Za-z]+}", produces = MediaType.APPLICATION_JSON_VALUE)
	//@GetMapping(value = "/{name:[A-Za-z]+}")
	public List<Book> getByName(@PathVariable String name) {
		return bookService.getByName(name);
	}
	
	
	 @GetMapping(value = "/all", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAll() {
		return bookService.getAll();
	}


	@PostMapping(value = "/add")
	public Book addBook(@RequestBody Book book) {

		System.out.println(book);
		return bookService.addBook(book);

	}

	/*


@PostMapping(value = "/booksummery")
	public BookDto createWithSummary(@RequestParam("book") String bookDtoStr) throws IOException {
		BookDto dto = objectMapper.readValue(bookDtoStr, BookDto.class);

		dto.setSummary(dto.getSummary());
		return bookService.create(dto);
	}


	 */

	// Update Dto (id and summary)
	@PutMapping (value = "/update", consumes = "application/json", produces = "application/json")
	public BookDto updateSummary(@RequestBody BookDto updatedBook) throws IOException {
		log.info("Updating summary for book with id " + updatedBook.getId());
		BookDto dto = bookService.getById(updatedBook.getId());

		log.info("New summary = " + updatedBook.getSummary());
		dto.setSummary(updatedBook.getSummary());

		return bookService.update(dto, dto.getId());
	}

// Delete by id
	@DeleteMapping(value = "/{id}" )
	public String deleteById(@PathVariable long id) {
		bookService.deleteById(id);
		return "L'id " + id + " est supprimé";
	}
}




