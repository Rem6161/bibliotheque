package fr.dawan.bibliotheque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.bibliotheque.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
