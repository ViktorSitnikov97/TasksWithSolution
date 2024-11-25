package io.programms.Functions.computeifAbsent;

import java.util.HashMap;
import java.util.Map;

public class AppCacheExample {
    private static final Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(computeIfAbsentExample("ASDF"));
        System.out.println(computeIfAbsentExample("ASDF"));
        System.out.println(computeIfAbsentExample("Vivalya"));
        System.out.println(computeIfAbsentExample("java"));
        System.out.println(computeIfAbsentExample("php"));
    }

    public static int expensiveOperation(String key) {
        return key.length();
    }

    public static int computeIfAbsentExample(String str) {
        return map.computeIfAbsent(str, (key) -> AppCacheExample.expensiveOperation(key));
    }
}
