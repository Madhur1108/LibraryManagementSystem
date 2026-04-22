package edu.Libarary_Management_System.dto;

import jakarta.validation.constraints.Min;

public class UpdateBookPriceDto {
	@Min(value = 1, message = "price must be greater than 0")
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
