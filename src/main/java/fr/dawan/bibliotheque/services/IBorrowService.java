package fr.dawan.bibliotheque.services;

import fr.dawan.bibliotheque.entities.Borrow;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IBorrowService {

    Borrow getById(long id);
}
