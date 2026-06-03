package com.example.demoX;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookstoreController {

    static List<InventoryBook> inventoryBooks = new ArrayList<>();

    @GetMapping("/addInventoryBook")


            //Integer id, String title, Integer stockCount, Double price);



}
