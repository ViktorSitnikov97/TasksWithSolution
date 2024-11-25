package io.programms.Collections.caching;

public class App {
    public static void main(String[] args) {
        Cache cache = new Cache(2);

        cache.put("praesent", "imperdiet et commodo vulputate");
        cache.put("amet erat", "in tempus sit amet");

        System.out.println(cache.get("praesent").equals("imperdiet et commodo vulputate"));
        System.out.println(cache.get("amet erat").equals("in tempus sit amet"));

        cache.put("justo sit", "auctor sed tristique in");

        System.out.println(cache.get("justo sit").equals("auctor sed tristique in"));
        System.out.println(cache.get("amet erat").equals("in tempus sit amet"));
        System.out.println(cache.get("praesent") == null);

        cache.put("sed", "vel ipsum praesent blandit");

        System.out.println(cache.get("sed").equals("vel ipsum praesent blandit"));
        System.out.println(cache.get("justo sit").equals("auctor sed tristique in"));
        System.out.println(cache.get("amet erat") == null);

        cache.put("sed", "another value");

        System.out.println(cache.get("sed").equals("another value"));
        System.out.println(cache.get("justo sit").equals("auctor sed tristique in"));
        System.out.println(cache.get("not exists") == null);

    }
}
