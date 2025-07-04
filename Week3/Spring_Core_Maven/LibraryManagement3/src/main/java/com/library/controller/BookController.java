package com.library.controller;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

   
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

   
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return bookRepository.findById(id).orElse(null);
    }

   
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable("id") Long id, @RequestBody Book updatedBook) {
        Book b = new Book();
        b = bookRepository.findByid(id);
        b.setTitle(updatedBook.getTitle());
        b.setAuthor(updatedBook.getAuthor());
        bookRepository.save(b);
        return b;
        
    }

    
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
        bookRepository.deleteById(id);
    }
}
