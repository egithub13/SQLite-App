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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
