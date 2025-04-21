package io.programms.Arrays.addingItemToArray;

import java.util.Arrays;
import java.util.Random;

public class App_1 {
    public static void main(String[] args) {
        // добавить новый элемент в массив
        var numbers = new int[10];
        var numbersNew = new int[numbers.length + 1];
        var rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(0, 4);
        }
        System.out.println(Arrays.toString(numbers));

        int addingIndex = 5;
        int rightPointer = 0;
        int number = 1337;
        for (int leftPointer = 0; leftPointer < numbersNew.length; leftPointer++) {
            if (rightPointer < addingIndex) {
                numbersNew[leftPointer] = numbers[rightPointer++];
            } else if (rightPointer == addingIndex) {
                numbersNew[leftPointer] = number;
                rightPointer++;
            } else {
                numbersNew[leftPointer] = numbers[rightPointer - 1];
                rightPointer++;
            }

        }
        System.out.println(Arrays.toString(numbersNew));
    }
}
