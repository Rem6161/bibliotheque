package fr.dawan.bibliotheque.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="author")
public class Author extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false, length = 100)
	private String surname;
	
	@Column(name = "date_of_birth", nullable = false)
	private LocalDate dateOfBirth;
	
	@Column(nullable = false, length = 50)
	private String nationatlity;
	
	
	@Column(nullable = false)
	private String description;
	
	@Column(name = "number_of_books", nullable = false)
	private int bookNumbers;
	
	@OneToMany(mappedBy = "author")
	private Set<Book> books = new HashSet<>();
	
	
	
	
	
}
