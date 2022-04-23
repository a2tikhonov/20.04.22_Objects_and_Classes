package ru.atikhonov;

import java.time.LocalDate;

public class Book {
    private String bookName;
    private Author author;
    private int publicationYear;

    Book(String bookName, Author author , int publicationYear) {
        if (bookName.length() != 0) this.bookName = bookName;
            else throw new RuntimeException("Название книги не должно быть пустым");
        this.author = author;
        if (publicationYear >= 1900 && publicationYear <= LocalDate.now().getYear()) this.publicationYear = publicationYear;
            else throw new RuntimeException("Введите корректный год издательства");
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() { return author.getAuthorLastName() + " " + author.getAuthorName(); }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
