package fr.dawan.bibliotheque.services;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import fr.dawan.bibliotheque.entities.exceptions.IdNotFoundException;
import fr.dawan.bibliotheque.mappers.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import fr.dawan.bibliotheque.dtos.BookDto;
import fr.dawan.bibliotheque.entities.Book;
import fr.dawan.bibliotheque.repositories.BookRepository;
import jakarta.validation.Valid;

@Service
@Transactional
@Validated
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookMapper bookMapper;

	@Override
	public BookDto getById(long id) {
		Optional<Book> bookOptional = bookRepository.findById(id);
		if(bookOptional.isEmpty()) {
			System.out.println(("id not found"));
			return null;
		}

		Book book = bookOptional.get();
		return bookMapper.toDto(book);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Book> getByName(String name){
		List<Book> books = bookRepository.findByNameLike(name + "%");
       // return books.stream().map(m -> mapper.toDto(m)).toList();
		return books;
		
	}

	@Override
	public void deleteById(long id) {
		if(bookRepository.removeById (id) == 0) {
			throw new IdNotFoundException();
		}
	}

	@Override
	public BookDto create(@Valid BookDto bDto) {

		return bookMapper.toDto(bookRepository.save(bookMapper.toEntity(bDto)));
	}

	@Override
	public BookDto update(@Valid BookDto bDto, long id) {
		Book book = bookRepository.findById(id).orElseThrow(() -> new IdNotFoundException("Book with ID " + id + " not found"));
		bookMapper.update(bDto, book);

		return bookMapper.toDto(bookRepository.save(book));
	}

	@Override
	public List<Book> getAll() {
		List<Book> books = bookRepository.findAll();
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book addBook(Book book) {
		Book result=bookRepository.save(book);
		return result;

	}
/*

	public Page<Book> getByName(String name, LocalDate publicationDate) {
		Page<Book> books = bookRepository.findByNameAndPublicationDate(name, publicationDate, PageRequest.of(1, 3));
		return books;
	}

 */
}
