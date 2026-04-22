package edu.Libarary_Management_System.dto;

import java.security.MessageDigest;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {
	@NotBlank(message = "Titile cannot be blank")
	private String title;

	@NotBlank(message = "Titile cannot be blank")
	private String author;
	
	@Min(value = 1, message = "Price should be greater than 0")
	private Double price;
	
	private Integer year;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	} 
	
	
}
