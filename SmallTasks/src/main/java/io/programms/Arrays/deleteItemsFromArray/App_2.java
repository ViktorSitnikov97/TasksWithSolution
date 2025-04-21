package io.programms.Arrays.deleteItemsFromArray;

import java.util.Arrays;
import java.util.Random;

public class App_2 {
    public static void main(String[] args) {
        var numbers = new int[10];
        var rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(0, 10);
        }
        System.out.println(Arrays.toString(numbers));

        // удаление всех четных чисел из массива
        // вариант решения 1

//        var result = new int[numbers.length];
//        var resultArrPointer = 0;
//
//        for (int number : numbers) {
//            if (number % 2 == 1) {
//                result[resultArrPointer] = number;
//                resultArrPointer++;
//            }
//        }
//        var resultArr = Arrays.copyOf(result, resultArrPointer);
//        System.out.println(Arrays.toString(resultArr));

        // вариант решения 2

        var leftPointer= 0;

        for (int rightPointer = 0; rightPointer < numbers.length; rightPointer++) {
            if (numbers[rightPointer] % 2 == 1) {
                numbers[leftPointer] = numbers[rightPointer];
                leftPointer++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(numbers, leftPointer)));
    }
}
