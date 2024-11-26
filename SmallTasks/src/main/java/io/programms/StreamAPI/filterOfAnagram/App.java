package io.programms.StreamAPI.filterOfAnagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> coll1 = List.of("aabb", "abcd", "bbaa", "dada");
        List<String> result1 = App.filterAnagram("abba", coll1);
        System.out.println(result1); // ["aabb", "bbaa"]

        List<String> coll2 = List.of("crazer", "carer", "racar", "caers", "racer");
        List<String> result2 = App.filterAnagram("racer", coll2);
        System.out.println(result2); // ["carer", "racer"]

        List<String> coll3 = List.of("lazing", "lazy", "lacer");
        List<String> result3 = App.filterAnagram("laser", coll3);
        System.out.println(result3); // []
    }
//    public static List<String> filterAnagram(String word, List<String> list) {
//        return list.stream()
//                .filter(w -> isAnagram(w, word))
//                .collect(Collectors.toList());
//    }
//
//    private static boolean isAnagram(String currentWord, String word) {
//        char[] charArray1 = currentWord.toCharArray();
//        char[] charArray2 = word.toCharArray();
//        List<Character> list1 = new ArrayList<>();
//        List<Character> list2 = new ArrayList<>();
//        for (char c : charArray1) {
//            list1.add(c);
//        }
//        for (char c : charArray2) {
//            list2.add(c);
//        }
//
//        Map<Character, Long> map1 = list1.stream()
//                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));
//
//        Map<Character, Long> map2 = list2.stream()
//                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));
//
//        boolean isEqual = true;
//        for (var pair : map1.entrySet()) {
//            Character key = pair.getKey();
//            Long value = pair.getValue();
//            if (!map2.containsKey(key) || !value.equals(map2.get(key))) {
//                isEqual = false;
//            }
//        }
//        return isEqual;
//    }
    public static String normalize(String word) {
        return Arrays.stream(word.split(""))
                .sorted()
                .collect(Collectors.joining(""));
    }

    public static List<String> filterAnagram(String word, List<String> words) {
        String normalizedWord = normalize(word);
        return words.stream()
                .filter(item -> normalize(item).equals(normalizedWord))
                .toList();
    }
}
