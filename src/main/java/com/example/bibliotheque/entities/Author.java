package com.example.bibliotheque.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;



@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Author extends BaseEntity {

    @NotNull(message = "")
    private String name;

    @NotNull(message = "")
    private String firstName;

    @NotNull(message = "")
    private LocalDate dateOfBirth;

    @NotNull(message = "")
    private String nationality;

    @NotNull(message = "")
    private String description;

//    @NotNull(message = "")
//    @OneToMany(mappedBy = "author",  cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "author",  cascade = CascadeType.ALL)
    private List<Book> books;


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getNationality() { return nationality; }

    public void setNationality(String nationality) { this.nationality = nationality; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) { this.books = books; }

}
