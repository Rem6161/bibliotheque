package com.example.bibliotheque.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;





@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book extends BaseEntity {

    @NotNull(message = "")
    private String name;

    @NotNull(message = "")
    private String isbn;

    @NotNull(message = "")
    private String summary;

    @NotNull(message = "")
    private boolean ageRestriction;

    @NotNull(message = "")
    private LocalDate publicationDate;

    @NotNull(message = "")
    private boolean inStock;

    @ManyToOne
    private Author author;


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getIsbn() { return isbn; }

    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getSummary() { return summary; }

    public void setSummary(String summary) { this.summary = summary; }

    public boolean getAgeRestriction() { return ageRestriction; }

    public void setAgeRestriction(boolean ageRestriction) { this.ageRestriction = ageRestriction; }

    public LocalDate getPublicationDate() { return publicationDate; }

    public void setPublicationDate(LocalDate publicationDate) { this.publicationDate = publicationDate; }

    public boolean getInStock() { return inStock; }

    public void setInStock(boolean inStock) { this.inStock = inStock; }

    public Author getAuthor() { return author; }

    public void setAuthor(Author author) { this.author = author; }
}