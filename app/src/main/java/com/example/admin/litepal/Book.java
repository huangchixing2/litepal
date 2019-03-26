package com.example.admin.litepal;


import org.litepal.crud.LitePalSupport;

public class Book extends LitePalSupport {
    //表格的字段
    private int id;
    private String author;
    private Double price;
    private int pages;
    private String name;
    private String press;//出版社


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
