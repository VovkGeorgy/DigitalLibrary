package service.impl;

import service.IPrintMatter;

public class Book extends PrintMatter implements IPrintMatter {
    private final String type;
    private String cover;
    private String publishYear;
    private String publishingHouse;
    private String genre;
    private String isAvailable;

    public Book(String bookName, String bookAuthor, String year, String genre, String isAvailable, String signature) {
        this.type = "Book";
        this.name = bookName;
        this.author = bookAuthor;
        this.publishYear = year;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.signature = signature;
    }

    public Book(String bookName, String bookAuthor, String year, String genre, String isAvailable, String signature, String publishingHouse, String language, String cover) {
        this.type = "Book";
        this.name = bookName;
        this.author = bookAuthor;
        this.publishYear = year;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.signature = signature;
        this.publishingHouse = publishingHouse;
        this.language = language;
        this.cover = cover;
        this.isAvailable = isAvailable;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public String getGenre() {
        return genre;
    }
}
