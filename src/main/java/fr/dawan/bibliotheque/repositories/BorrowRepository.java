package fr.dawan.bibliotheque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.bibliotheque.entities.Borrow;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow, Long> {


}
