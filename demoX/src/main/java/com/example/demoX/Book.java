package com.example.demoX;

public class Book {

    private int id;
    private String name;
    private Integer authorId;


    public Book(int id, String name, Integer authorId) {
        this.id = id;
        this.name = name;
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
