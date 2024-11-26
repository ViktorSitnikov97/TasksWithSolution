package io.programms.StreamAPI.webinar1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Bob", "Elena", "Alexandr", "John");

        var peopleList = names.stream()
                .map(s -> new People(s, new Random().nextInt(20, 50)))
                .toList();

        System.out.println(peopleList);

        List<People> people1 = peopleList.stream()
                .peek(people -> people.setAge(people.getAge() + 1)) // меняет внутреннее состояние объектов,
                .collect(Collectors.toList());                            // что влияет на состояние исходной коллектции
        System.out.println(people1);
        System.out.println(peopleList);

        long count = people1.stream()
                .filter(p -> p.getAge() > 30)
                .count();
        System.out.println(count);

        boolean b = peopleList.stream()
                .allMatch(people -> people.getAge() > 10);
        System.out.println(b);

        People person = peopleList.stream().
                filter(p -> p.getName().startsWith("A"))
                .findFirst()
                .orElse(null);

        peopleList.forEach(System.out::println);
    }
}
