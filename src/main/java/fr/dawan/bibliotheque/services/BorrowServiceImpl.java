package fr.dawan.bibliotheque.services;

import fr.dawan.bibliotheque.entities.Borrow;
import fr.dawan.bibliotheque.mappers.BorrowMapper;
import fr.dawan.bibliotheque.repositories.BorrowRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@Validated
public class BorrowServiceImpl implements IBorrowService{

    @Autowired
    private BorrowRepository borrowRepository;

    @Autowired
    private BorrowMapper borrowMapper;

    @Override
    @Transactional
    public Borrow getById(long id) {
        Borrow borrow = borrowRepository.findById(id).get();
        return borrow;
    }


    @Override
    @Transactional
    public List<Borrow> getByBorrowDate(LocalDate borrowDate) {
        return borrowRepository.getByBorrowDate(borrowDate);
    }

    @Override
    @Transactional
    public List<Borrow> getByBorrowReturnDate(LocalDate borrowReturnDate) {
        return borrowRepository.findByBorrowReturnDate(borrowReturnDate);
    }


}
