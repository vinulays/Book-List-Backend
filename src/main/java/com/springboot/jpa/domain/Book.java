package com.springboot.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_ID")
    private Long id;

    @Column(name = "BOOK_TITLE")
    private String title;

    @Column(name = "BOOK_AUTHOR")
    private String author;

    @Column(name = "ISBN_NUMBER")
    private String isbn_number;

    @Column(name = "NUMBER_OF_PAGES")
    private String no_of_pages;

    @Column(name = "PRICE")
    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getIsbn_number() {
        return isbn_number;
    }

    public void setIsbn_number(String isbn_number) {
        this.isbn_number = isbn_number;
    }

    public String getNo_of_pages() {
        return no_of_pages;
    }

    public void setNo_of_pages(String no_of_pages) {
        this.no_of_pages = no_of_pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
