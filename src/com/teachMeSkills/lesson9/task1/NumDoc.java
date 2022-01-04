package com.teachMeSkills.lesson9.task1;

public class NumDoc {

    // Вывести на экран в одну строку два первых блока по 4 цифры
    static String getNumb(String st) {

        st = st.substring(0, 4) + " " + st.substring(9, 13);
        return st;

    }


    //Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
    static String changeLetter(String st) {

        //разница между replace replaceAll??
        st = st.replace("Y", "y").
                replace("R", "r").
                replace("t", "T").
                replace("r", "R").
                replace("N", "n").
                replace("f", "F");
        return st;

    }


    // Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
    static String changeFormat(String st) {

        st = (st.substring(5, 8) + "/" + st.substring(14, 17) + "/" +
                st.substring(19, 20) + "/" + st.substring(21)).toLowerCase();
        return st;
    }

    //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
    static String changeFormatSB(StringBuilder st) {
        return (st.substring(5, 8) + "/" + st.substring(14, 17) + "/" + st.substring(19, 20) + "/" + st.substring(21)).toUpperCase();
    }

    //Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью)
    static String isContainABC(String st) {

        st = st.toUpperCase();
        if (st.contains("ABC")) {
            return "Yes, it contains ABC";
        } else {
            return "No, it doesn't contain ABC";
        }

    }

    //Проверить начинается ли номер документа с последовательности 555.
    static String isStart(String st) {

        if (st.startsWith("555")) {
            return "Yes, it starts with 555";
        } else {
            return "No, it doesn't start with 555";
        }

    }

    //Проверить заканчивается ли номер документа на последовательность 1a2b.
    static String isEnd(String st) {

        if (st.endsWith("1a2b")) {
            return "Yes, it ends with 1a2b";
        } else {
            return "No, it doesn't end with 1a2b";
        }

    }
}
