package io.programms.StreamAPI.webinar2;

import java.util.List;
import java.util.Random;

import static io.programms.StreamAPI.webinar2.BookGenerator.generateRandomBooks;

public class UserGenerator {
    private static final String[] NAMES = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Ivy", "Jack"};
    private static final int MAX_BOOKS_PER_USER = 5;

    public static User generateRandomUser() {
        Random random = new Random();
        String name = NAMES[random.nextInt(NAMES.length)];
        int age = random.nextInt(50) + 20; // between 20 and 70
        List<Book> books = generateRandomBooks(random.nextInt(MAX_BOOKS_PER_USER) + 1);
        return new User(name, age, books);
    }
}
