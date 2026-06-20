package com.example.library_management.dao;

import com.example.library_management.dto.Book;
import com.example.library_management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    @Autowired
    BookRepository bookRepository;

    public String insertData(Book book){
        bookRepository.save(book);
        return "data inserted successfully";
    }
}
