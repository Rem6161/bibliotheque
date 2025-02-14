package com.example.bibliotheque.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Generates getters, setters, toString, equals, and hashCode methods.
@NoArgsConstructor // Generates a no-args constructor.
@AllArgsConstructor // Generates a constructor with all arguments.
@Builder // Generates a builder pattern for creating instances.
public class Book {
    @Id // Specifies the primary key of the entity.
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the primary key value.
    private Long id;
    private String name;
    @ManyToOne
    private Author author;
}
