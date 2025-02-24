package fr.dawan.bibliotheque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.bibliotheque.entities.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {

}
