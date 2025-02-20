package fr.dawan.bibliotheque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.bibliotheque.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
