package io.programms.Collections.detection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    private static final List<Map<String, String>> BOOKS = List.of(
            Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611"),
            Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111"),
            Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611"),
            Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222"),
            Map.of("title", "Still foooing", "author", "FooBar", "year", "3333"),
            Map.of("title", "Happy Foo", "author", "FooBar", "year", "4444")
    );
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        boolean hasContains = true;
        for (var book : books) {
            for (var pair : where.entrySet()) {
                var itemValue = book.getOrDefault(pair.getKey(), "");
                if (!itemValue.equals(pair.getValue())) {
                    hasContains = false;
                }
            }
            if (hasContains) {
                result.add(book);
            }
            hasContains = true;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Map<String, String>> expected = List.of(
                Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611"),
                Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611")
        );
        Map<String, String> where = Map.of("author", "Shakespeare", "year", "1611");
        List<Map<String, String>> actual = App.findWhere(BOOKS, where);

        System.out.println(actual);
    }
}
