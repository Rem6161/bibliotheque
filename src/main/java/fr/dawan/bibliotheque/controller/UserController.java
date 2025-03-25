package fr.dawan.bibliotheque.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import fr.dawan.bibliotheque.dtos.UserDto;
import fr.dawan.bibliotheque.entities.Users;
import fr.dawan.bibliotheque.services.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j

@RestController
@RequestMapping("/api/biblio")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private ObjectMapper objectMapper;

    // Find user by id
    @GetMapping(value = "/user-by-id/{id:[0-4]}")
    public Users userDto(@PathVariable Long id) {
        return userService.getById(id);
    }
}
