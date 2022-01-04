package com.teachMeSkills.lesson9.task3;

import java.util.Arrays;

class MyString {

    static String findSymbols(String str) {
        String[] arrayStr = str.split(" ");
        char[] arrayChar = str.toCharArray();
        int[] arraySameSymb = new int[arrayStr.length];

        int sameSymb = 0;
        char lastSymb = arrayChar[0];
        int j = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == ' ') {
                arraySameSymb[j] = sameSymb - 1;        //потому что last и первое всегда совпадают
                j++;
                sameSymb = 0;
                lastSymb = arrayChar[i + 1];
            } else if (lastSymb == arrayChar[i]) {
                sameSymb++;
            } else if (lastSymb != arrayChar[i]) {
                lastSymb = arrayChar[i];
            }

            if (i == arrayChar.length - 1) {
                arraySameSymb[j] = sameSymb;
            }

        }

        System.out.println(Arrays.toString(arraySameSymb));
        sameSymb = finMax(arraySameSymb);               //ищем индекс слова, в котором максимальное число совпадений букв

        return arrayStr[sameSymb];
    }

    private static int finMax(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

}
