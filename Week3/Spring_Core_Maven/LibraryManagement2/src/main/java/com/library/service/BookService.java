package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repo.BookRepo;
@Service
public class BookService {
	
	//@Autowired
    private BookRepo bookRepository;
	private String message;
    
    public void setBookRepository(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }
	 public BookService(String message) {
	        this.message = message;
	    }
   
    public void addBook(String title) {
        System.out.println(message + ": Adding book: " + title);
        if (bookRepository != null) {
            bookRepository.saveBook(title);
        } else {
            System.out.println("BookRepository not injected!");
        }
    }
}