package io.programms.Functions.compute;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<String> words = List.of("banana", "orange", "apple", "orange", "apple", "pear", "orange");
        System.out.println(getWordsCount(words));
    }
    public static Map<String, Integer> getWordsCount(List<String> words) {
        Map<String, Integer> wordsCount = new HashMap<>();
        words.forEach(word -> {
            wordsCount.compute(word, (key, count) -> count == null ? 1 : count + 1);
        });
        return wordsCount;
    }
}
