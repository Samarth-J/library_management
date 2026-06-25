package com.example.library_management.dao;

import com.example.library_management.dto.Book;
import com.example.library_management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookDao {
    @Autowired
    BookRepository bookRepository;

    public String insertData(Book book){
        bookRepository.save(book);
        return "data inserted successfully";
    }
    public Book fetchbyId(int id){
       Optional<Book> ob =bookRepository.findById(id);
       Book b=ob.get();
       return b;
    }

    public List<Book> fetchall(Book book){
        return bookRepository.findAll();
    }
}
