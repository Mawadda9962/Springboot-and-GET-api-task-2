package com.example.demoX;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookstoreController {

    static List<InventoryBook> inventoryBooks = new ArrayList<>();

    @GetMapping("/addInventoryBook")
    public String addInventoryBook (@RequestParam Integer id, @RequestParam String title, @RequestParam Double price, @RequestParam Integer stockCount){

        InventoryBook book = new InventoryBook(id,title,stockCount, price);
        inventoryBooks.add(book);

        return ("Book added to a catalog successfully");
    }

    @GetMapping("/checkStock")
    public String checkStock(@RequestParam Integer id)




}
