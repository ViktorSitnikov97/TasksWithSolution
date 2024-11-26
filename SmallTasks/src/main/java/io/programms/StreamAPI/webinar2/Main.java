package io.programms.StreamAPI.webinar2;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<User> users = Stream.generate(UserGenerator::generateRandomUser)
                .limit(3);
        Stream<String> strings = Stream.of("a2", "b2", "c2", "a3", "b3", "c3", "a4", "a1", "b1", "c1", "a2", "b2", "c2", "a3", "b3", "c3", "a4", "b4", "c4");


//        Map<String, Set<User>> map = users.collect(Collectors.groupingBy(User::name, Collectors.toSet()));
//        System.out.println(map);


        long count = users.map(User::books).mapToLong(List::size).sum();

        System.out.println(count);

//        Map<String, Integer> map = users.collect(Collectors.toMap(User::name, user -> user.books().size()));
//        System.out.println(map);
//        users
//                .filter(u -> u.age() > 30)
//                .map(User::books)
//                .flatMap(b -> b.stream())
//                .sorted(Comparator.comparing(Book::author))
//                .toList(); // возвращает неизменяемый список




//        _______________________________________________________start7
//        users
//                .filter(u -> u.age() > 30)
//                .map(User::books)
//                .flatMap(b -> b.stream())
//                .sorted(Comparator.comparing(Book::author))
//                .forEach(System.out::println);
//        ___________________________________________________________end7
//________________________________________________________start6
//        users
//                .sorted((o1, o2) -> {
//                    if (o1.age() == o2.age()) {
//                        return o1.name().compareTo(o2.name());
//                    } else {
//                        return o1.age() > o2.age() ? 1 : -1;
//                    }
//                })
////                .sorted(Comparator.comparing(o -> o.age()))
////                .sorted(Comparator.comparing(User::age))
//                .forEach(System.out::println);
//____________________________________________________________________end6

//_____________________________________________________________________________start5
//        strings
////                .sorted((o1, o2) -> o2.compareTo(o1))
////                .sorted(Comparator.reverseOrder())
////                .sorted((o1, o2) -> o1.substring(1, 2).compareTo(o2.substring(1, 2)))
//                .sorted(Comparator.comparing(o -> o.substring(1, 2)))
//                .forEach(System.out::println);


//        strings.filter(s -> s.contains("c"))
//                .forEach(System.out::println);
//        _________________________________________________________________________end5


//        ___________________________________________________start4
//        strings
//                .dropWhile(s -> s.endsWith("1"))
//                .forEach(System.out::println);
//        _____________________________________________________end4

//        ______________________________________________________start1
//        System.out.println(UserGenerator.generateRandomUser());
//        List<Book> books = BookGenerator.generateRandomBooks(10);
//        books.forEach(System.out::println);

//        Stream.generate(() -> UserGenerator.generateRandomUser());
//        Stream.generate(UserGenerator::generateRandomUser)
//                .limit(10)
//                .skip(5)
//                .forEach(System.out::println);
//
//        Stream.of(
//                UserGenerator.generateRandomUser(),
//                UserGenerator.generateRandomUser(),
//                UserGenerator.generateRandomUser(),
//                UserGenerator.generateRandomUser(),
//                UserGenerator.generateRandomUser()
//        ).forEach(System.out::println);
//
//        Stream.builder()
//                .add(UserGenerator.generateRandomUser())
//                .add(UserGenerator.generateRandomUser())
//                .build()
//                .forEach(System.out::println);
//        Stream.iterate(2, i -> i * 2)
//                .limit(10)
//                .forEach(System.out::println);
//______________________________________________________________________end1

//_________ ____________________________________________________________start2
//        Stream<String> strings = Stream.of("a1", "b1", "c1", "a2", "b2", "c2", "a3", "b3", "c3", "a4", "b4", "c4");
//        strings
//                .skip(3)
//                .limit(3)
//                .forEach(System.out::println);

//        strings
//                .map(s -> s.substring(0, 1))
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

//        users.map(User::name) // record так работает - метод name() не является статическим
//                .forEach(System.out::println);
//        ______________________________________________________________end2

//        _______________________________________________________start3
//        Stream<List<Book>> streamBooks1 = users.map(User::books);
//        streamBooks1.forEach(System.out::println);

//        users.map(User::books)
////                .flatMap(list -> list.stream())
////                .flatMap(Collection::stream)
//                .flatMap(List::stream)
//                .forEach(System.out::println);

//        _______________________________________________________end3


    }
}
