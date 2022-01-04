package com.teachMeSkills.lesson9.task4;

public class Polindrom {

    static boolean isPolindrom(String[] arrayStr, int numb) {

        String st = arrayStr[numb];
        StringBuilder sb = new StringBuilder(st);
        StringBuilder sb1 = new StringBuilder(st);

        sb.reverse();
        if (sb.toString().equals(sb1.toString())) {
            return true;
        } else {
            return false;
        }

    }

}
