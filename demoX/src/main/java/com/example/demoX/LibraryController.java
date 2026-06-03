package com.example.demoX;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {
    private static List<Author> authorList = new ArrayList<>();
    private static List<Book> bookList = new ArrayList<>();


    @GetMapping("/addAuthor")
    public String addAuthor (@RequestParam String name, @RequestParam int id, @RequestParam String biography){
        Author author = new Author(name, id, biography);
        authorList.add(author);
        return ("Author added Successfully");
    }

    @GetMapping("/allAuthors")
    public List<Author> getAuthorList(){
        return authorList;
    }

    @GetMapping("/addRelationalBook")
    public String addRelationalBook (@RequestParam Integer id , @RequestParam String name, @RequestParam Integer AuthorId){

        boolean authorExists = false ;

        for (Author a : authorList){
            if (a.getId() == AuthorId){
                authorExists = true;
            }
        }

        if (authorExists){
            Book book = new Book(id,name,AuthorId);
            bookList.add(book);
            return ("Book added Successfully");
        }else {
            return("Author not found");
        }

    }

    @GetMapping("/authorReport")
    public String authorReport(@RequestParam String authorName) {
        Author foundAuthor = null;

        for (Author a : authorList) {
            if (a.getName().equalsIgnoreCase(authorName)) {
                foundAuthor = a;
            }
        }

        if (foundAuthor == null) {
            return "Error: Author not found!";
        }

        String report = "Author: " + foundAuthor.getName();

        String books = "";

        for (Book b : bookList) {
            if (b.getAuthorId() == foundAuthor.getId()) {
                books = books + b.getName() + ", ";
            }
        }

        if (books.isEmpty()) {
            report = report + "None";
        } else {
            report = report + books;
        }

        return report;
    }

}
