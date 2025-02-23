package fr.dawan.bibliotheque.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.bibliotheque.entities.Book;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {

	 
	List<Book> findByName(String name);



}
