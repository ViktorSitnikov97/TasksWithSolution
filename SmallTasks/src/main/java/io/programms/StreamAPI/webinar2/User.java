package io.programms.StreamAPI.webinar2;

import java.util.List;

public record User(
    String name,
    int age,
    List<Book> books
) {
}
