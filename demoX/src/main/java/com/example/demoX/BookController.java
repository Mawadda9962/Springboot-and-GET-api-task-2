package com.example.demoX;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private static List<Book> bookshelf = new ArrayList<Book>();




    public String addBook (int id, String name){
        Book book = new Book(id,name);
        bookshelf.add(book);
    }
}

