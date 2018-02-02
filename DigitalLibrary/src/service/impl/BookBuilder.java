package service.impl;

public class BookBuilder {
    private String name;
    private String author;
    private String publishYear;
    private String genre;
    private String isAvailable;
    private String signature;

    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setPublishYear(String publishYear) {
        this.publishYear = publishYear;
        return this;
    }

    public BookBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public BookBuilder setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Book build() {
        return new Book(name, author, publishYear, genre, isAvailable, signature);
    }
}
