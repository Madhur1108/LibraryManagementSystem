package edu.Libarary_Management_System.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import edu.Libarary_Management_System.dto.BookDto;
import edu.Libarary_Management_System.dto.UpdateBookPriceDto;
import edu.Libarary_Management_System.service.BookService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/book")
public class BookController {
	
	private BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	@GetMapping("/{id}")
	public BookDto getBook(@PathVariable int id) {
		return bookService.getBookById(id);
	}
	
	@GetMapping
	public List<BookDto> getAllBook(){
		return bookService.getAllBooks();
	}
	@PostMapping
	public BookDto addBook(@Valid @RequestBody BookDto dto) {
		return bookService.addBook(dto);
	}
	
	@PutMapping("/{id}")
	public BookDto updateBook(@PathVariable int id, @Valid @RequestBody BookDto dto){
		return bookService.updateBook(id, dto);
	}
	
	@PatchMapping("{id}")
	public void updateBookPrice(@PathVariable int id, @Valid @RequestBody UpdateBookPriceDto dto) {
		bookService.updateBookPrice(id, dto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
	}
	
	
	
}
