package fr.dawan.bibliotheque;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliothequeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BibliothequeApplication.class, args);
	}

	 @Override
	    public void run(String... args) throws Exception {
	        System.out.println("Application started with CommandLineRunner!");
	    }
}
