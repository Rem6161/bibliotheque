package com.example.bibliotheque.repositories;


import com.example.bibliotheque.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Author entity.
 * Provides CRUD operations and custom query methods through JpaRepository.
 */
@Repository // Indicates that this interface is a Spring Data repository.
public interface IAuthorRepository extends JpaRepository<Author, Long> {}