package fr.dawan.bibliotheque.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.dawan.bibliotheque.dtos.AuthorDto;
import fr.dawan.bibliotheque.entities.Author;
import fr.dawan.bibliotheque.services.IAuthorService;
import fr.dawan.bibliotheque.services.IBookService;
import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import lombok.extern.slf4j.Slf4j;

@Slf4j

@RestController
@RequestMapping("/api/biblio")
public class AuthorController {

    @Autowired
    private IAuthorService authorService;

    @Autowired
    private ObjectMapper objectMapper;

    // Find author by id

    @GetMapping(value = "/author/{id}")
    public Author getById(@PathVariable long id) {
        return authorService.getById(id);
    }

    //Find author by name

    @GetMapping(value = "/author-name/{name:[A-Za-z]+}")
    public  List<Author> getByName(@PathVariable String name) {
        return authorService.getByName(name);
    }


    // Add author to database

    @PostMapping(value = "/add-author")
    public AuthorDto addAuthor(@RequestBody AuthorDto authorDto) {

        return authorService.addAuthor(authorDto);
    }

    //Update an Author

    @PutMapping(value = "/update-author/{id}")
    public AuthorDto updateAuthor(@RequestBody AuthorDto updateAuthor) {

        return authorService.updateAuthor(updateAuthor);
    }

    // to delete an author you should first understand the use of cascade on @OneToMany
    // in our case it's in Author entity (cascade = CascadeType.ALL)
    @DeleteMapping(value = "/delete-author/{id}")
    public String deleteById(@PathVariable long id) {
        authorService.deleteById(id);
        return "l'Id " + id + "est supprimé";
    }
}
