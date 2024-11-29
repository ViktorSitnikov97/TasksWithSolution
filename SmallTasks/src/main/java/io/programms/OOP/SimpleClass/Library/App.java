package io.programms.OOP.SimpleClass.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Book[] library = {
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1922),
                new Book("Twenty Thousand Leagues Under the Sea", "Jules Verne", 2000),
                new Book("Moby Dick", "Herman Melville", 1998),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 2012)
        };

        var book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1980);

        var result = App.find(library, book);
        System.out.println(Arrays.toString(result));
    }
    public static Book[] find(Book[] library, Book book) {
        List<Book> books = new ArrayList<>();

        for (var currentBook : library) {
            if (currentBook.equals(book)) {
                books.add(currentBook);
            }
        }
        return books.stream()
                .map(book1 -> new Book(book1.getTitle(), book1.getAuthor(), book1.getPublished()))
                .toArray(Book[]::new);
    }
}
