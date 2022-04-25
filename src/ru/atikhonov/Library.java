package ru.atikhonov;

public class Library {
    private Book[] books;

    Library(int booksArrayLength) {
        books = new Book[booksArrayLength];
    }

    public void addBook(Book bookToAdd) {
        if (books[books.length - 1] != null) throw new RuntimeException("Массив переполнен, книга " + bookToAdd.getBookName() + " не добавлена");
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookToAdd;
                break;
            }
        }
    }

    public void printAllBooks() {
        for (int i = 0; i < books.length && books[i] != null; i++) {
            System.out.println(books[i].getAuthorName() + ": " + books[i].getBookName() + ": " + books[i].getPublicationYear());
        }
    }

    public void printBookInfo(String bookName) {
        for (int i = 0; i < books.length && books[i] != null; i++) {
            if (bookName.equals(books[i].getBookName()))
                System.out.println(books[i].getBookName() + " by " + books[i].getAuthorName() + " was published in " + books[i].getPublicationYear());
        }
    }

    public void setPublicationYear(String bookName, int newPublicationYear) {
        for (int i = 0; i < books.length && books[i] != null; i++) {
            if (bookName.equals(books[i].getBookName())) books[i].setPublicationYear(newPublicationYear);
        }
    }

}
