package edu.Libarary_Management_System.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.Libarary_Management_System.dto.BookDto;
import edu.Libarary_Management_System.dto.UpdateBookPriceDto;
import edu.Libarary_Management_System.entity.Book;
import edu.Libarary_Management_System.mapper.BookMapper;
import edu.Libarary_Management_System.repositary.BookReopository;
import edu.Libarary_Management_System.service.BookService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

	private final BookReopository bookReopository;
	private final BookMapper mapper;

	public BookServiceImpl(BookReopository bookReopository, BookMapper mapper) {
		super();
		this.bookReopository = bookReopository;
		this.mapper = mapper;
	}

	@Override
	public BookDto getBookById(int id) {
		Book book= bookReopository.findById(id).orElseThrow();
		return mapper.toDto(book);
	}

	@Override
	public List<BookDto> getAllBooks() {
		List<Book> books = bookReopository.findAll();
		return books.stream().map(mapper::toDto).toList();
	}

	@Override
	public BookDto addBook(BookDto dto) {
		
		Book book= mapper.toEntity(dto);
		
		Book newBook = bookReopository.save(book);
		return mapper.toDto(newBook);
	}

	@Override
	public BookDto updateBook(int id, BookDto dto) {
		Book book = bookReopository.findById(id).orElseThrow();
		book.setTitle(dto.getTitle());
		book.setAuthor(dto.getAuthor());
		book.setPrice(dto.getPrice());
		book.setYear(dto.getYear());
		
		Book update = bookReopository.save(book);
		return mapper.toDto(update);
	}

	@Override
	public void updateBookPrice(int id, UpdateBookPriceDto b) {
		Book book = bookReopository.findById(id).orElseThrow();
		book.setPrice(b.getPrice());
		bookReopository.save(book);
	}

	@Override
	public void deleteBook(int id) {
		if(bookReopository.findById(id) != null) {
		bookReopository.deleteById(id);
		}
	}

}
