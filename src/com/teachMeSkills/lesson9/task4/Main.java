package com.teachMeSkills.lesson9.task4;

import java.util.Scanner;

/**
 * Дана строка произвольной длины с произвольными словами.
 * Написать программу для проверки является ли любое выбранное слово в строке полиндромом.
 * Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке полиндромом.
 * Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход программе передали число 500 и т.п. ситуации.
 */
public class Main {

    public static void main(String[] args) {

        String str = "мадам хлеб кран шалаш";
        String[] arrayStr = str.split(" ");

        int numb = isCorrectNumber(arrayStr);
        if (Polindrom.isPolindrom(arrayStr, numb)) {
            System.out.println("Слово " + arrayStr[numb] + " является полиндоромом");
        } else {
            System.out.println("Слово " + arrayStr[numb] + " не является полиндоромом");
        }


    }

    private static int isCorrectNumber(String[] arrStr) {

        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        int numb = 0;

        boolean correctN = false;
        while (!correctN) {
            numb = scanner.nextInt();
            if (numb < 0) {
                System.out.println("Введите число больше 0");
            } else if (numb > arrStr.length) {
                System.out.println("Введите число меньше " + arrStr.length);
            } else {
                correctN = true;
            }
        }

        if (numb > 0) {
            numb -= 1;
        }

        System.out.println("numb " + numb);
        return numb;
    }


}
