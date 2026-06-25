package com.example.library_management.service;

import com.example.library_management.dao.BookDao;
import com.example.library_management.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public String insertData(Book book){
        return bookDao.insertData(book);
    }

    public Object fetchbyId(int id){
        Optional<Book> ob=bookDao.fetchbyId(id);
        if(ob.isPresent()){
            return ob.get();
        }
        else {
            return "Data not found";
        }
    }

    public List<Book> fetchall(Book book){
        return bookDao.fetchall(book);
    }
}