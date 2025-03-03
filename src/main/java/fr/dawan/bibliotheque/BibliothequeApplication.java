package fr.dawan.bibliotheque;

import java.time.LocalDate;
import java.util.List;

import fr.dawan.bibliotheque.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.dawan.bibliotheque.entities.Author;
import fr.dawan.bibliotheque.entities.Book;
import fr.dawan.bibliotheque.entities.Borrow;
import fr.dawan.bibliotheque.entities.Users;
import fr.dawan.bibliotheque.repositories.AuthorRepository;
import fr.dawan.bibliotheque.repositories.BorrowRepository;
import fr.dawan.bibliotheque.repositories.UserRepository;
import fr.dawan.bibliotheque.services.BookServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@SpringBootApplication(scanBasePackages = "fr.dawan.bibliotheque")
public class BibliothequeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BibliothequeApplication.class, args);

		
	} 
	@Autowired
	private AuthorRepository authorRepository;

   @Autowired
	private UserRepository userRepository;

	@Autowired
	private BorrowRepository borrowRepository;

	@Autowired
	private BookServiceImpl bookServiceImpl;

	 @Autowired
	 private BookRepository bookRepository;

	 @Override
	    public void run(String... args) throws Exception {
	        System.out.println("Application started with CommandLineRunner!");


	        System.out.println("\n ______ User Repository _____ \n");
			System.out.println(userRepository);

			List<Users> users = userRepository.findAll();
			for (var u : users) {
				System.out.println(u.getName());
			}

			 System.out.println("--------book name by id");
			 Book book = bookRepository.findById(25L).get();
			 System.out.println( book.getName());


				System.out.println("\n ______ Borrow Repository _____ \n");
				List<Borrow> borrows = borrowRepository.findAll();

				for(var bo : borrows) {
					System.out.println(bo.getBorrowDate() + " , " + bo.getBorrowReturnDate());
				}


				System.out.println("\\n ______ Author Repository _____ \\n");
				List<Author> authors = authorRepository.findAll();

				for(var a : authors) {
					System.out.println(a.getName());
				}





				System.out.println("\n ________books runner start_____ \n");

				List<Book> books1 = bookServiceImpl.getByName("TEST BOOK");
				for (var b : books1) {
					System.out.println(b.getIsbn());

				}

				System.out.println("\n ________end book repository______ \n");



			//---------------------------PAGINATION-------------------------


/**

			System.out.println("\n ________ PAGINATION ______ \n");



		 Sort sort = Sort.by("name").and(Sort.by(Sort.Direction.DESC, "publication_date"));
		Page<Book> b1 = bookRepository.findByNameAndPublicationDate("Book 1" ,
				LocalDate.of(2025, 02, 06),
				PageRequest.of(1, 3));

		b1.getContent().forEach(b -> System.out.println(b));

		  */
	    }

}
