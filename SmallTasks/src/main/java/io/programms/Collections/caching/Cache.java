package io.programms.Collections.caching;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache {
    private int maxSize;
    private final Map<String, String> cache;

    public Cache(int size) {
        this.maxSize = size;
        cache = new LinkedHashMap<>();
    }

    public void put(String key, String value) {
        if (cache.size() + 1 > this.maxSize) {
            if (cache.containsKey(key)) {
                cache.put(key, value);
                return;
            }
            Map.Entry<String, String> pair = cache.entrySet().stream().findFirst().get();
            String innerKey = pair.getKey();
            cache.remove(innerKey);
            cache.put(key, value);
        } else {
            cache.put(key, value);
        }
    }

    public String get(String key) {
        return cache.get(key);
    }
}
