package com.teachMeSkills.lesson9.task1;

/**
 * Написать программу со следующим функционалом:
 * На вход передать строку(будем считать, что это номер документа).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.
 * Вывести на экран в одну строку два первых блока по 4 цифры
 * Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
 * Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
 * Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
 * Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 * Проверить начинается ли номер документа с последовательности 555.
 * Проверить заканчивается ли номер документа на последовательность 1a2b.
 * Все эти методы реализовать в отдельном классе в статических методах, которые на вход(входным параметром) будут принимать ввводимую на вход программы строку.
 */
public class Main {

    public static void main(String[] args) {

        String numDoc = "5554-YNt-0009-rYN-1a2b";
        StringBuilder sbNum = new StringBuilder("5764-YNt-0009-rYN-4f9t");

        System.out.println(NumDoc.getNumb(numDoc));
        System.out.println(NumDoc.changeLetter(numDoc));
        System.out.println(NumDoc.changeFormat(numDoc));
        System.out.println("Letters:" + NumDoc.changeFormatSB(sbNum));
        System.out.println(NumDoc.isContainABC(numDoc));
        System.out.println(NumDoc.isStart(numDoc));
        System.out.println(NumDoc.isEnd(numDoc));

    }

}
