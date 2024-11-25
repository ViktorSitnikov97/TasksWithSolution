package io.programms.Functions.ComputeIfPresent;

import java.util.HashMap;
import java.util.Map;

public class AppDiscountExample {
    public static void main(String[] args) {
        Map<String, Double> goods = new HashMap<>();
        goods.put("backpack", 8d);
        goods.put("T-shirt", 14d);
        goods.put("ball", 5d);

        System.out.println(goods);
        applyDiscount(goods);
        System.out.println(goods);
    }
    public static void applyDiscount(Map<String, Double> goods) {
        String[] items = {"T-shirt", "sword", "stick"};

        for (var item : items) {
            System.out.println(goods.computeIfPresent(item, (key, value) -> value * 0.1 + (double) key.length()));
        }
    }
}
