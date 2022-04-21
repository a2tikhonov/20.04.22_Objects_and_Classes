package ru.atikhonov;

public class Main {

    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov ,1966);
        masterAndMargarita.setPublicationYear(1967);
        Author svoren = new Author("Рудольф", "Сворень");
        Book electronicaShagZaShagom = new Book("Электроника шаг за шагом", svoren, 1968);
    }
}
