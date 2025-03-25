package fr.dawan.bibliotheque.services;

import fr.dawan.bibliotheque.dtos.UserDto;
import fr.dawan.bibliotheque.entities.Users;
import fr.dawan.bibliotheque.mappers.UserMapper;
import fr.dawan.bibliotheque.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public Users getById(long id) {
        Users users = userRepository.findById(id).get();
        return users;
    }

    public List<Users> getAll() {
        List<Users> users = userRepository.findAll();
        return userRepository.findAll();
    }
}
