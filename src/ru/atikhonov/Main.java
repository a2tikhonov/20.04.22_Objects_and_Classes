package ru.atikhonov;

import java.util.Arrays;

public class Main {

    public static void addBook(Book[] booksArray, Book bookToAdd) {
        if (booksArray[booksArray.length - 1] != null) throw new RuntimeException("Массив переполнен, книга " + bookToAdd.getBookName() + " не добавлена");
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i] == null) {
                booksArray[i] = bookToAdd;
                break;
            }
        }
    }

    public static void printAllBooks(Book[] booksArray) {
        for (int i = 0; i < booksArray.length && booksArray[i] != null; i++) {
            System.out.println(booksArray[i].getAuthorName() + ": " + booksArray[i].getBookName() + ": " + booksArray[i].getPublicationYear());
        }
    }

    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov ,1966);
        masterAndMargarita.setPublicationYear(1967);
        Author svoren = new Author("Рудольф", "Сворень");
        Book electronicaShagZaShagom = new Book("Электроника шаг за шагом", svoren, 1968);
        //Доп задание 1
        Book[] books = new Book[5];
        Book sobachyeSerdce = new Book("Собачье сердце", bulgakov, 1987);
        addBook(books, sobachyeSerdce);
        addBook(books, masterAndMargarita);
        addBook(books, electronicaShagZaShagom);
        printAllBooks(books);
        //Доп задание 2
        Author king = new Author("Steven", "King");
        Book castleRock = new Book("Castle Rock", king, 1979);
        Library library = new Library(5);
        library.addBook(castleRock);
        library.printBookInfo("Castle Rock");
        library.setPublicationYear("Castle Rock", 1981);
        library.printAllBooks();
        Author bulgakov2 = new Author("Михаил", "Булгаков");
        if (bulgakov.equals(bulgakov2)) System.out.println("Bulgakov equals");
        if (bulgakov.hashCode() == bulgakov2.hashCode()) System.out.println("Bulgakov hash equals");
        System.out.println("bulgakov2.toString() = " + bulgakov2.toString());
        Book masterAndMargarita2 = new Book("Мастер и Маргарита", bulgakov ,1966);
        System.out.println("masterAndMargarita2.toString() = " + masterAndMargarita2.toString());
        if (masterAndMargarita2.equals(masterAndMargarita)) System.out.println("MasterAndMargarita books equals");
        if (masterAndMargarita2.hashCode() == masterAndMargarita.hashCode()) System.out.println("MasterAndMargarita books hash equals");
        //if (masterAndMargarita2.hashCode() != castleRock.hashCode()) System.out.println("MasterAndMargarita and CastleRock books hash doesnt equals");
    }
}
