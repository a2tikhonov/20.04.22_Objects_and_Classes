package ru.atikhonov;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publicationYear;

    Book(String bookName, Author author , int publicationYear) {
        if (bookName.length() != 0) this.bookName = bookName;
            else throw new IllegalArgumentException("Название книги не должно быть пустым");
        this.author = author;
        if (publicationYear >= 1900 && publicationYear <= LocalDate.now().getYear()) this.publicationYear = publicationYear;
            else throw new IllegalArgumentException("Введите корректный год издательства");
    }

    @Override
    public String toString() {
        return author.toString() + ": " + bookName;
    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) return false;
        return bookName.equals(((Book) object).bookName) && author.equals(((Book) object).author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName + author.hashCode());
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
