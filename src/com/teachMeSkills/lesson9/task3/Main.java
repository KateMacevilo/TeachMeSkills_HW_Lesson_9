package com.teachMeSkills.lesson9.task3;

/**
 * Дана строка произвольной длины с произвольными словами.
 * Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
 * Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */
public class Main {

    public static void main(String[] args) {

        String str = "thtttt prrs 3333g 6 8 fg";
        System.out.println(MyString.findSymbols(str));


    }

}
