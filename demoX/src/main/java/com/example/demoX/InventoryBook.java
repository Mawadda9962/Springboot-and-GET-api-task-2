package com.example.demoX;

public class InventoryBook {
    private Integer BookId;
    private String title;
    private Double price;
    private Integer StockCount;

    public InventoryBook(Integer bookId, String title, Integer stockCount, Double price) {
        BookId = bookId;
        this.title = title;
        StockCount = stockCount;
        this.price = price;
    }
}
