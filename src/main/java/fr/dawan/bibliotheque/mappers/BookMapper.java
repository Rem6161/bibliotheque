package fr.dawan.bibliotheque.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

import fr.dawan.bibliotheque.dtos.BookDto;
import fr.dawan.bibliotheque.entities.Book;

@Mapper(componentModel = ComponentModel.SPRING)
public interface BookMapper extends GenericMapper<Book, BookDto>{

	//@Mapping(source = "auhtor.id", target = "")
	
}
