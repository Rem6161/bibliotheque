package fr.dawan.bibliotheque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.bibliotheque.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
