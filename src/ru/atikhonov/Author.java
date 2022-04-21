package ru.atikhonov;

public class Author {
    private String authorName;
    private String authorLastName;

    Author(String authorName, String lastName) {
        if (authorName.length() != 0 && lastName.length() != 0) {
            this.authorName = authorName;
            this.authorLastName = lastName;
        } else throw new RuntimeException("Поля имя и/или фамилия автора не должны быть пустыми");
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }
}
