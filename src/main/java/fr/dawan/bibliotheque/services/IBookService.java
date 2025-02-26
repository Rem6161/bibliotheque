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

	//Page<BookDto> getAll(Pageable page);	
	
    BookDto getById(long id);
    
    List<Book> getByName(String name);
    
    List<Book> getAll();

	public Book addBook(Book book);

    void deleteById(long id);
    
    BookDto create(@Valid  BookDto bDto);

    BookDto update(@Valid  BookDto dto,long id);




	/***
     * 
     * 
	@Autowired
	private BookRepository bookRepository;
	
	public Book addBokk(Book book) {
		return bookRepository.save(book);
		
	}
	
	 public Optional<Book> getBookById(Long id) {
		return bookRepository.findById(id);
	}

	 public Book updateBook(Long id, Book newBook) {
	        return bookRepository.findById(id).map(book -> {
	            book.setName(newBook.getName());
	            book.setAuthor(newBook.getAuthor());
	            book.setSummary(newBook.getSummary());
	            return bookRepository.save(book);
	        }).orElseThrow(() -> new RuntimeException("Livre non trouvé"));
	 }
	 
	 
	 
	    public void deleteBook(Long id) {
	        bookRepository.deleteById(id);
	    }
     * 
     * 
     */
}
