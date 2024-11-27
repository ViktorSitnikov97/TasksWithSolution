package io.programms.StreamAPI.webinar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _2Main_1 {
    public static void main(String[] args) {
        List<User>list = new ArrayList<>(List.of(
                new User("Aeroe", 18),
                new User("Xenia", 19),
                new User("Alba", 24),
                new User("Mike", 33),
                new User("Sara", 27),
                new User("Bob", 29)));

        NameComparator nameComparator = new NameComparator();
        list.sort(nameComparator);
        System.out.println(Arrays.toString(list.toArray()));

        AgeComparator ageComparator = new AgeComparator();
        list.sort(ageComparator);
        System.out.println(Arrays.toString(list.toArray()));
    }



}

class User {
    String name;
    Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class NameComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.name.compareTo(user2.name);
    }
}
class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.age.compareTo(user2.age);
    }
}