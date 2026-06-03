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
    public String checkStock(@RequestParam int id) {
        for (InventoryBook I : inventoryBooks) {
            if (I.getBookId().equals(id)) {
                if (I.getStockCount() > 0) {
                    return "Available! Title: " + I.getTitle() + " " + "Price: " + I.getPrice() + " " + "Stock: " + I.getStockCount();
                } else {
                    return "Sorry, this books is currently sold out!";
                }
            }
        }
        return "This book ID does not exist in our catalog!";
    }

    @GetMapping("/LowStockReorderReport")
    public String LowStockReorderReport(@RequestParam Integer threshold) {

        String report = "";

        for (InventoryBook b : inventoryBooks) {
            if (b.getStockCount() <= threshold) {
                report = report + "Title: " + b.getTitle() + " " + "Stock" + b.getStockCount();
            }
        }
        if (report.isEmpty()) {
            return "No books currently need reordering!";
        }

        return report;
    }
}
