package com.teachMeSkills.lesson9.task5;

class NewString {

    static String getNewString(String str) {

        char[] arrayChar = str.toCharArray();
        StringBuilder sb = new StringBuilder();

//        for (int i = 0; i < arrayChar.length; i++) {
//            sb.append(String.valueOf(arrayChar[i]) + String.valueOf(arrayChar[i]));
//        }

        for (char letter : arrayChar) {
            sb.append(String.valueOf(letter).concat(String.valueOf(letter)));
        }
        return sb.toString();

    }

}
