package fr.dawan.bibliotheque.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.dawan.bibliotheque.entities.Author;
import fr.dawan.bibliotheque.services.IAuthorService;
import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@Slf4j

@RestController
@RequestMapping("/api/biblio")
public class AuthorController {

    @Autowired
    private IAuthorService authorService;

    @Autowired
    private ObjectMapper objectMapper;

    // FInd author by id

    @GetMapping(value = "/author/{id}")
    public Author getById(@PathVariable long id) {
        return authorService.getById(id);
    }

    @GetMapping(value = "/author-name/{name:[A-Za-z]+}")
    public  List<Author> getByName(@PathVariable String name) {
        return authorService.getByName(name);
    }
}
