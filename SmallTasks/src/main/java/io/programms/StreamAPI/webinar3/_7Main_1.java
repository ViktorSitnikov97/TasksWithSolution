package io.programms.StreamAPI.webinar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _7Main_1 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>(List.of(
                new User("Aeroe", 18),
                new User("Xenia", 19),
                new User("Alba", 24),
                new User("Mike", 33),
                new User("Sara", 27),
                new User("Bob", 29)));

        long count = list.stream()
                .filter(user -> user.age > 25)
                .map(user -> user.name + " " + user.age)
                .count();

        List<String> bikeBrands = Arrays.asList("Giank", "Scott", "Trek");

        Bicycle[] arr = bikeBrands.stream()
                .map(brand -> new Bicycle(brand))
                .toArray(size -> new Bicycle[size]);

        System.out.println(Arrays.toString(arr));


    }
}

class Bicycle {
    String brand;

    public Bicycle(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
