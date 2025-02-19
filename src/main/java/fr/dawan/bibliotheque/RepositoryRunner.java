package fr.dawan.bibliotheque;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order
public class RepositoryRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n ______ Service Runner_____ \n");
	}

}
