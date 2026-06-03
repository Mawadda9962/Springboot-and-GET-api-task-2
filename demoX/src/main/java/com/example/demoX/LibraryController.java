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


    @GetMapping("/add-author")
    public String addAuthor (@RequestParam String name, @RequestParam int id, @RequestParam String biography){
        Author author = new Author(name, id, biography);
        authorList.add(author);
        return ("Author added Successfully");
    }

    @GetMapping("/all-authors")
    public List<Author> getAuthorList(){
        return authorList;
    }

    @GetMapping("/add-relational-book")
    public String addRelationalBook (@RequestParam Integer id , @RequestParam String name, @RequestParam Integer AuthorId){

        boolean authorExists = false ;


        for (Author a : authorList){
            if (a.getId() == AuthorId){
                authorExists = true;
            }
        }

        }




}
