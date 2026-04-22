package edu.Libarary_Management_System.service;

import java.util.List;

import edu.Libarary_Management_System.dto.BookDto;
import edu.Libarary_Management_System.dto.UpdateBookPriceDto;

public interface BookService {
	
	public BookDto getBookById(int id);
	
	public List<BookDto> getAllBooks();
	
	public BookDto addBook(BookDto dto);

	public BookDto updateBook(int id, BookDto dto);
	
	public void updateBookPrice(int id, UpdateBookPriceDto b); 
	
	public void deleteBook(int id);
	
	
}
