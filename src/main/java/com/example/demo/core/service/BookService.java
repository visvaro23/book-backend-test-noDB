package com.example.demo.core.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    public Book createBook(String name, String author) throws Exception;

    public Book updateBook(String id, String name, String author) throws Exception;

    public List<Book> getBooks();

    public Book getBook(String id) throws Exception;

    public void deleteBook(String id) throws Exception;

}
