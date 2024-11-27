package io.programms.StreamAPI.nearestSearch;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        App.findIndexOfNearest(new ArrayList<Integer>(), 0); // -1

        List<Integer> coll1 = List.of(15, 10, 3, 4);
        System.out.println(App.findIndexOfNearest(coll1, 0));  // 2

        List<Integer> coll2 = List.of(7, 5, 3, 2);
        System.out.println(App.findIndexOfNearest(coll2, 4)); // 1

        List<Integer> coll3 = List.of(7, 5, 4, 4, 3);
        System.out.println(App.findIndexOfNearest(coll3, 4)); // 2

        List<Integer> coll4 = List.of(10, 15);
        System.out.println(App.findIndexOfNearest(coll4, 0));


    }
//    public static int findIndexOfNearest(List<Integer> numbers, int num) {
//        int resultIndex = -1;
//        if (numbers.isEmpty()) {
//            return resultIndex;
//        }
//        int value = 0;
//        int minValue = Integer.MAX_VALUE;
//        for (int i = 0; i < numbers.size(); i++) {
//            value = Math.abs(numbers.get(i) - num);
//            if (minValue > value) {
//                minValue = value;
//                resultIndex = i;
//            }
//        }
//        return resultIndex;
//    }

    public static int findIndexOfNearest(List<Integer> numbers, int num) {
        if (numbers.isEmpty()) {
            return -1;
        }

        List<Integer> listDiff = numbers.stream()
                .map(element -> Math.abs(num - element))
                .toList();

        int minDiff = listDiff.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
        return listDiff.indexOf(minDiff);
    }
}
