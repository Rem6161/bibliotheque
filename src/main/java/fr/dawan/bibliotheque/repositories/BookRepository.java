package fr.dawan.bibliotheque.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.bibliotheque.entities.Book;


@Repository
//@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {

	 
	  List<Book> findByNameLike(String name);

	int removeById(long id);

	//List<Book> findByName(String name);
	//Page<Book> findByNameAndPublicationDate(String name, LocalDate publicationDate, Pageable pageable);

}
