package io.programms.StreamAPI.webinar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _4Main_1 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>(List.of(
                new User("Aeroe", 18),
                new User("Xenia", 19),
                new User("Alba", 24),
                new User("Mike", 33),
                new User("Sara", 27),
                new User("Bob", 29)));

////        list.sort((user1, user2) -> user1.name.compareTo(user2.name));
//        list.sort(Comparator.comparing(user -> user.name));
//        System.out.println(Arrays.toString(list.toArray()));
//
////        list.sort((user1, user2) -> user1.age.compareTo(user2.age));
//        list.sort(Comparator.comparing(user -> user.age));
//        System.out.println(Arrays.toString(list.toArray()));

//        __________________________________________________________

        List<User> sortedUsers = list.stream()
                .filter(item -> item.name.contains("A"))
                .sorted((u1, u2) -> u1.name.compareTo(u2.name))
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(sortedUsers.toArray()));
    }
}
