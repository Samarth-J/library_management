package com.example.library_management.service;

import com.example.library_management.dao.BookDao;
import com.example.library_management.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public String insertData(Book book){
        return bookDao.insertData(book);
    }

    public Book fetchbyId(int id){
        return bookDao.fetchbyId(id);
    }
}
