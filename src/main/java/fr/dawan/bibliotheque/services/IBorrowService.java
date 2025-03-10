package fr.dawan.bibliotheque.services;

import fr.dawan.bibliotheque.entities.Borrow;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface IBorrowService {

    Borrow getById(long id);

    List<Borrow> getByBorrowDate(LocalDate borrowDate);

    List<Borrow> getByBorrowReturnDate(LocalDate borrowReturnDate);

    void deleteById(long id);
}
