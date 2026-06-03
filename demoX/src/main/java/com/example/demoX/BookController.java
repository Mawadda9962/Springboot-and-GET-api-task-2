package com.example.demoX;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private static List<Book> bookshelf = new ArrayList<Book>();

@GetMapping("add-book")
    public String addBook (@RequestParam int id, @RequestParam String name){
        Book book = new Book(id,name);
        bookshelf.add(book);
        return ("Book added Successfully");
    }


@GetMapping("all-books")
    public List<Book> getAllBooks(){
    return bookshelf;

  }

@GetMapping("find-by-id")
public Book findById(@RequestParam int id){

}

}

