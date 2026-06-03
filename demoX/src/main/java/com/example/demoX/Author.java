package com.example.demoX;

public class Author {
    private int id;
    private  String name;
    private  String biograph;


    public Author(String name, int id, String biograph) {
        this.name = name;
        this.id = id;
        this.biograph = biograph;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
a
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiograph() {
        return biograph;
    }

    public void setBiograph(String biograph) {
        this.biograph = biograph;
    }
}
