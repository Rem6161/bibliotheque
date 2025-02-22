package fr.dawan.bibliotheque.entities;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import fr.dawan.bibliotheque.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "borrow")
public class Borrow extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "borrow_date", nullable = false)
	private LocalDate borrowDate;
	
	@Column(name = "borrow_return_date", nullable = false)
	private LocalDate borrowReturnDate;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 15)
	private Status status;
	
	@ManyToMany
	@Exclude
	private Set<Book> books = new HashSet<>();
	
	@ManyToOne
	@Exclude
	private Users user;
	
	
}














