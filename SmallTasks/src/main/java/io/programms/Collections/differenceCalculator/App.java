package io.programms.Collections.differenceCalculator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

public class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        TreeSet<String> set = new TreeSet<>();
        set.addAll(data1.keySet());
        set.addAll(data2.keySet());
        Map<String, String> result = new LinkedHashMap<>();
        for (String key : set) {
            if (!data2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (!data1.containsKey(key)) {
                result.put(key, "added");
            } else if (Objects.equals(data1.get(key), data2.get(key))) {
                result.put(key, "unchanged");
            } else {
                result.put(key, "changed");
            }
        }
        return result;
    }
}
