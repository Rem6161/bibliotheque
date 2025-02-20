package fr.dawan.bibliotheque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import fr.dawan.bibliotheque.repositories.BookRepository;


@Component
@Order
public class RepositoryRunner implements CommandLineRunner {

	
	@Autowired
	private BookRepository bookRepository;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n ______ Repository Runner_____ \n");
		
		
	}

}
