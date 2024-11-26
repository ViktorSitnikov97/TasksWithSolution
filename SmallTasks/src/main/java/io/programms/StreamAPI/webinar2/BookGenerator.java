package io.programms.StreamAPI.webinar2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class BookGenerator {
    private static final String[] TITLES = {"The Great Gatsby", "To Kill Bill", "Advanced using of Java", "1984", "The Hobbit", "Frozen Paradise"};
    private static final String[] AUTHORS = {"Alberto", "Sergio Pelligrini", "Assert", "Kventin Tarantino", "Mesut O`Zil"};
    private static final int[] YEARS = {1925, 1956, 1999, 1954, 1679, 1917};

    public static List<Book> generateRandomBooks(int n) {
        return Stream.generate(BookGenerator::generateRandomBook)
                .limit(n)
                .toList();
    }

    public static Book generateRandomBook() {
        Random random = new Random();
        String title = TITLES[random.nextInt(TITLES.length)];
        String author = AUTHORS[random.nextInt(AUTHORS.length)];
        int year = YEARS[random.nextInt(YEARS.length)];
        return new Book(title, author, year);

    }
}
