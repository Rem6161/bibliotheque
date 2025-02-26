package fr.dawan.bibliotheque.dtos;

import java.util.List;

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
public class AuthorDto {

	
	@PositiveOrZero(message = "ID must be zero or positive")
	private long id;
	
    @NotNull(message = "Author name cannot be null")
    @Size(max = 80)
	private String name;
	
    @NotNull(message = "Author first name cannot be null")
    @Size(max = 80)
	private String firstName;
	
    
    @NotNull
    @Size(max = 80)
	private String nationality;
	
	private String description;
	
	private long bookNumbers;
	
	private List<BookDto> books;
	
	
}
