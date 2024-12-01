package io.programms.Arrays.webinar1;

import java.util.Arrays;

public class App_1 {
    public static void main(String[] args) {

//        double[][] doubles = new double[4][];
//        System.out.println(Arrays.deepToString(doubles));
//
//        var ints2 = new int[2][3][4];
//        ints2[1][2][2] = 4;
//
//        System.out.println(Arrays.deepToString(ints2));
//
//        var strings = new String[3][];
//
//        strings[0] = new String[]{"0"};
//        strings[1] = new String[]{"0", "0"};
//        strings[2] = new String[]{"0", "0", "0"};
//        strings[0][0] = "1";
//        strings[1][0] = "1";
//        strings[2][0] = "1";
//
//        System.out.println(Arrays.deepToString(strings));

//        int[] ints = new int[]{1, 2, 3, 4};
//
//        int[] ints2 = Arrays.copyOf(ints, 10);
//
//        int[] ints3 = Arrays.copyOfRange(ints, 1, 5);
//
//        System.out.println(Arrays.toString(ints2));
//        System.out.println(Arrays.toString(ints3));

        String[] strings = new String[3];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "String" + i;
        }

        System.out.println(Arrays.toString(strings));

        int i = 4;

        for (String string : strings) { // только для чтения пригоден!!!!!!!!
            string = string + i;  // !!!!!!!!!!!!!!!!!!!
            i++;
        }
        System.out.println(Arrays.toString(strings));
    }
}
