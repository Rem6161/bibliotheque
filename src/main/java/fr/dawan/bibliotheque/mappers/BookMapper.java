package fr.dawan.bibliotheque.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

import fr.dawan.bibliotheque.dtos.BookDto;
import fr.dawan.bibliotheque.entities.Book;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = ComponentModel.SPRING)
public interface BookMapper extends GenericMapper<Book, BookDto>{


    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "publicationDate", target = "publicationDate")
    @Mapping(source = "summary", target = "summary")
    @Mapping(source = "ageRestriction", target = "ageRestriction")
    @Mapping(source = "stock", target = "stock")
    @Mapping(source = "author.id", target = "author.id")
    @Override
    BookDto toDto(Book entity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "publicationDate", target = "publicationDate")
    @Mapping(source = "summary", target = "summary")
    @Mapping(source = "ageRestriction", target = "ageRestriction")
    @Mapping(source = "stock", target = "stock")
    @Mapping(source = "author.id", target = "author.id")
    @Override
    Book toEntity(BookDto dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "publicationDate", target = "publicationDate")
    @Mapping(source = "summary", target = "summary")
    @Mapping(source = "ageRestriction", target = "ageRestriction")
    @Mapping(source = "stock", target = "stock")
    @Mapping(source = "author.id", target = "author.id")
    @Override
    void update(BookDto dto, @MappingTarget Book entity);

}
