package fr.dawan.bibliotheque.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

import fr.dawan.bibliotheque.dtos.BookDto;
import fr.dawan.bibliotheque.entities.Book;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = ComponentModel.SPRING)
public interface BookMapper extends GenericMapper<Book, BookDto>{


    @Mapping(source = "h", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    //@Override
    BookDto toEntity(Book entity);

    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    //@Override
    BookDto toDto(BookDto dto);

    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    @Mapping(source = "", target = "")
    //@Override
    void update(BookDto dto, @MappingTarget Book entity);

}
