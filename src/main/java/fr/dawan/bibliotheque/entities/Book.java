package fr.dawan.bibliotheque.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode.Exclude;
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
@Table(name = "books")
public class Book extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private long isbn;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false, length = 100)
	private LocalDate publicationDate;
	
	@Column(nullable = false)
	private String summary;
	
	@Column(columnDefinition = "TINYINT(1)", nullable = false)
	private boolean ageRestriction;
	
   
    @Column(columnDefinition = "TINYINT(1)", nullable = false)
	private boolean stock;
	
	@ManyToOne
	@Exclude
	//@JoinColumn(name = "id")
	private Author author;
	
	
	@ManyToMany//(mappedBy = "books")
	@Exclude
	/*
	 @JoinTable(
            name = "book_borrow",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id")
        )
	 */

	private Set<Borrow> borrows = new HashSet<>();
	
}
