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

    public Integer getBookId() {
        return BookId;
    }

    public void setBookId(Integer bookId) {
        BookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockCount() {
        return StockCount;
    }

    public void setStockCount(Integer stockCount) {
        StockCount = stockCount;
    }
}
