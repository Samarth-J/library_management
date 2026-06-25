package com.example.library_management.controller;

import com.example.library_management.dto.Book;
import com.example.library_management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping
    public String insertData( @RequestBody Book book){
       return bookService.insertData(book);
    }

    @GetMapping
    public Book fetchbuId(@RequestBody  Book book){
        int id = book.getId();
        return bookService.fetchbyId(id);
    }

    @GetMapping("/all")
    public List<Book> fetchall(@RequestBody Book book){
        return bookService.fetchall(book);
    }
}