package io.programms.Collections.memoization;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class App {
    public static final Map<Integer, Integer> numbersFib = new ConcurrentHashMap<>();
    public static void main(String[] args) {

        System.out.println(fib(10));
        System.out.println(fib(9));
        System.out.println(fib(8));
        System.out.println(fib(7));
        System.out.println(fib(6));
        System.out.println(fib(5));
    }
    public static int fib(int n) {
        return numbersFib.computeIfAbsent(n, keyNum -> {
            if (keyNum == 1) {
                return 0;
            } else if (keyNum == 2) {
                return 1;
            }
            return fib(keyNum - 1) + fib(keyNum - 2);
        });
    }

}
