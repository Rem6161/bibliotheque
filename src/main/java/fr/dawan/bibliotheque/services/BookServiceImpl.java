package fr.dawan.bibliotheque.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import fr.dawan.bibliotheque.dtos.BookDto;
import fr.dawan.bibliotheque.entities.Book;
//import fr.dawan.bibliotheque.mappers.BookMapper;
import fr.dawan.bibliotheque.repositories.BookRepository;
import jakarta.validation.Valid;

@Service
@Transactional
@Validated
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	//private BookMapper mapper;

	@Override
	public List<Book> getById(long id) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub

	}

	@Override
	public BookDto create(@Valid BookDto bDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDto update(@Valid BookDto bDto, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAll() {
		List<Book> books = bookRepository.findAll();
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book addBook(Book book) {
		Book result=bookRepository.saveAndFlush(book);
		return result;

	}


}
