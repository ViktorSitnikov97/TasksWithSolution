package io.programms.OOP.SimpleClass.Library;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Book {
    private String title;
    private String author;
    @EqualsAndHashCode.Exclude
    private int published;
}
