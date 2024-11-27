package io.programms.StreamAPI.webinar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _1Main_1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Elena", "Aeron", "Mike", "Sara", "John", "helga"));
        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));
    }

}
