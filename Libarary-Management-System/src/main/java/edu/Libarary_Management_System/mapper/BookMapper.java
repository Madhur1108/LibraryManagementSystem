package edu.Libarary_Management_System.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.Libarary_Management_System.dto.BookDto;
import edu.Libarary_Management_System.entity.Book;

@Component
public class BookMapper {
	@Autowired
	private ModelMapper mapper;
	
	public BookDto toDto(Book book) 
	{
		return mapper.map(book,BookDto.class);
    }

    // Convert DTO to Entity
    public Book toEntity(BookDto dto) {
       return mapper.map(dto, Book.class);
    }

}
