package io.programms.StreamAPI.ipConverter;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        System.out.println(App.ipToDec("128.32.10.1")); // 2149583361
        System.out.println(App.ipToDec("0.0.0.0")); // 0
        System.out.println(App.ipToDec("255.255.255.255")); // 4294967295

        System.out.println(App.decToIp(2149583361L)); // "128.32.10.1"
        System.out.println(App.decToIp(0L)); // "0.0.0.0"
        System.out.println(App.decToIp(4294967295L)); // "255.255.255.255"

    }

    public static long ipToDec(String stringIp) {
        String resultString = stringIp.replace(".", "!");
        String[] strArray = resultString.split("!");

        long result = (long) Integer.parseInt(strArray[0]) * 16777216
                + (long) Integer.parseInt(strArray[1]) * 65536
                + (long) Integer.parseInt(strArray[2]) * 256
                + (long) Integer.parseInt(strArray[3]);

        return result;

    }

    public static String decToIp(long number) {
        Long[] ip = new Long[4];
        for(int i = 0; i <= 3; i++){
            ip[i] = number & 0xff;
            number = number >> 8;
        }
        String result = "";
        for (var num : ip) {
            result = "." + Integer.parseInt(Long.toString(num)) + result;
        }

        return result.substring(1);
    }

    public static String[] chunk(String text, int chunkSize) {
        return text.split("(?<=\\G.{" + chunkSize + "})");
    }
}
