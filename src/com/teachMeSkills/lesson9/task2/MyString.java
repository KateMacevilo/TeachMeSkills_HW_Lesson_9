package com.teachMeSkills.lesson9.task2;

class MyString {

    static String isShorterWord(String st) {

        String[] arrayWord = getArrayWords(st);

        int indexMin = 0;
        int indexMax = 0;
        int min = arrayWord[0].length();
        int max = 0;

        for (int i = 0; i < arrayWord.length; i ++){
           if (arrayWord[i].length() > min){
               max = arrayWord[i].length();
               indexMax = i;
           } else if (arrayWord[i].length() == min) {
               min = arrayWord[i].length();
               indexMin = i;
           } else  {
               indexMax = indexMin;
               max = min;
               min = arrayWord[i].length();
               indexMin = i;
           }

        }
        return "the shortest word " + arrayWord[indexMin] + " " + "the longest word " + arrayWord[indexMax];

    }

    private static String[] getArrayWords(String st) {
        //String[] arr = st.split(" ");             ---- а можно было просто сделать так =)
        char[] arraySt = st.trim().toCharArray();

        int j = 0;
        for (char item:arraySt) {
            if (item == ' '){
                j += 1;
            }
        }

        String[] words = new String[j + 1];
        String word = "";
        int index = 0;

        for (int i = 0; i < words.length; i++) {
            for (int k = index; k < arraySt.length; k++) {
                if (arraySt[k] != ' ') {
                    word += arraySt[k];
                    if (k == arraySt.length - 1) {
                        words[i] = word;
                    }
                } else {
                    index = k + 1;
                    words[i] = word;
                    word = "";
                    break;
                }
            }
        }

        return words;

    }
}
