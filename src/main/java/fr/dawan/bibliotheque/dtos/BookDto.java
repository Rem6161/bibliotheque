package fr.dawan.bibliotheque.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Builder
public class BookDto {

	
	  @PositiveOrZero(message = "ID must be zero or positive")
	    private long id;

	    @NotNull(message = "ISBN cannot be null")
	    @Size(max = 80, message = "ISBN must be a valid number with a maximum length of 80")
	    private long isbn;

	    @NotNull(message = "Book name cannot be null")
	    @Size(max = 80, message = "Book name must have a maximum length of 80")
	    private String name;

	    @Size(max = 500, message = "Summary cannot exceed 500 characters")
	    private String summary;

	    private boolean ageRestriction;

	    private boolean stock;
	    
	    private AuthorDto author;

		private byte[] image;
	
}
