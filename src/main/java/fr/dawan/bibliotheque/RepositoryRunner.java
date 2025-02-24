package fr.dawan.bibliotheque;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import fr.dawan.bibliotheque.entities.Book;
import fr.dawan.bibliotheque.repositories.BookRepository;


@Component
@Order(1)
public class RepositoryRunner implements CommandLineRunner {

	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n ______ Repository Runner_____ \n");
		System.out.println(bookRepository);
		
		/*
		 * 		System.out.println(bookRepository.count());
			Book livreOpt = bookRepository.findById(1L).orElse(null);
			System.out.println(livreOpt);
		
	  */
		List<Book> books = bookRepository.findAll();
		
		for(var b : books) {
			System.out.println(b.getName());
		}
	
		//bookRepository.findByName("Book 2").forEach(b -> System.out.println(b));


	}

}
