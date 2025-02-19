package fr.dawan.bibliotheque.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
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
public class Book extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private int isbn;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false, length = 100)
	private LocalDate publicationDate;
	
	@Column(nullable = false)
	private String summary;
	
	@Column(nullable = false)
	private boolean ageRestriction;
	
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length=15)
	private Stock stock;
	
	@ManyToOne
	@Exclude
	private Author author;
	
}
