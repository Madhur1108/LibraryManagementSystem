package edu.Libarary_Management_System.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.Libarary_Management_System.entity.Book;

@Repository
public interface BookReopository 
extends JpaRepository<Book, Integer>{
	
}
