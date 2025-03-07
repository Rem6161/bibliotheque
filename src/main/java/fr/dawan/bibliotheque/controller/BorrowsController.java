package fr.dawan.bibliotheque.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import fr.dawan.bibliotheque.entities.Borrow;
import fr.dawan.bibliotheque.services.BorrowServiceImpl;
import fr.dawan.bibliotheque.services.IBorrowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Slf4j

@RestController
@RequestMapping("/api/biblio")
public class BorrowsController {

    @Autowired
    private IBorrowService borrowService;

    @Autowired
    private ObjectMapper objectMapper;


    @GetMapping(value = "/find-borrow/{id}")
    public Borrow getById(@PathVariable long id) {
        return borrowService.getById(id);
    }


    @GetMapping(value = "/borrow-date")
    public List<Borrow> getByBorroDate(@RequestParam LocalDate borrowDate) {
        return borrowService.getByBorrowDate(borrowDate);
    }


}
