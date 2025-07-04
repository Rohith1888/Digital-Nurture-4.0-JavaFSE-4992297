package com.library.repo;

import org.springframework.stereotype.Repository;

//	@Repository
public class BookRepo {
    public void saveBook(String title) {
        System.out.println("Saving book: " + title);
    }
}

