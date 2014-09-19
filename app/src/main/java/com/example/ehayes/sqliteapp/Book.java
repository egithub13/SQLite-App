package com.example.ehayes.sqliteapp;

/**
 * Created by ehayes on 9/19/2014.
 */
public class Book {

    private int id;
    private String title;
    private String author;

    public Book(){

    }
    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public String toString(){
        return "Book [id =" + id + ", title =" + title + "author =" + author + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
