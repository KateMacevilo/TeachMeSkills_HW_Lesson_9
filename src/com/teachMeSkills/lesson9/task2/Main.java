package com.teachMeSkills.lesson9.task2;

import java.util.Scanner;

/**
 * Дана строка произвольной длины с произвольными словами.
 * Найти самое короткое слово в строке и вывести его на экран.
 * Найти самое длинное слово в строке и вывести его на экран.
 * Если таких слов несколько, то вывести последнее из них.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a sentence ");
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();

        System.out.println(st.trim().toCharArray());
        System.out.println(MyString.isShorterWord(st));
    }

}
