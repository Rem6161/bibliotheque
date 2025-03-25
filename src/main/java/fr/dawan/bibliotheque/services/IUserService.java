package fr.dawan.bibliotheque.services;

import fr.dawan.bibliotheque.dtos.UserDto;
import fr.dawan.bibliotheque.entities.Users;

public interface IUserService {

    Users getById(long id);
}
