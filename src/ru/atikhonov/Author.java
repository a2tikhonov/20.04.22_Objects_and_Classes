package ru.atikhonov;

import java.util.Objects;

public class Author {
    private String authorName;
    private String authorLastName;

    Author(String authorName, String lastName) {
        if (authorName.length() != 0 && lastName.length() != 0) {
            this.authorName = authorName;
            this.authorLastName = lastName;
        } else throw new IllegalArgumentException("Поля имя и/или фамилия автора не должны быть пустыми");
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public String toString() {
        return authorName + " " + authorLastName;
    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) return false;
        Author author = (Author) object;
        return authorName.equals(author.getAuthorName()) && authorLastName.equals(author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName + authorLastName);
    }
}
