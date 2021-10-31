package HW_17_18;

import java.util.Locale;

public class Task_7 {

    /* Написать метод, который посчитает количество
       гласных букв в строке. Для нахождения гласных
       букв использовать метод contains()
        (гласные буквы - “a”, “e”, “i”, “o”, “u”)
        Test Data:
        “QA For Everyone” -> 6
        “Java lessons are fun” -> 7
     */

    // метод split(N) - делим на мелкие кусочки по параметру N, и ложим в массив

    public int countVowelsLetters1(String string) {
        if (string == null || string.length() == 0) {
            return -1;
        }
        int count = 0;
        String[] array = string.toLowerCase().split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("a") || array[i].contains("e") || array[i].contains("i") || array[i].contains("o") || array[i].contains("u")) {
                count++;
            }
        }
        return count;
    }

    // через метод substring()

    public int countVowelsLetters2 (String string) {
        if (string == null || string.length() == 0) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.toLowerCase(Locale.ROOT).substring(i, i+1).contains("a")) {
                count++;
            }
            if (string.toLowerCase(Locale.ROOT).substring(i, i+1).contains("e")) {
                count++;
            }
            if (string.toLowerCase(Locale.ROOT).substring(i, i+1).contains("i")) {
                count++;
            }
            if (string.toLowerCase(Locale.ROOT).substring(i, i+1).contains("o")) {
                count++;
            }
            if (string.toLowerCase(Locale.ROOT).substring(i, i+1).contains("u")) {
                count++;
            }
        }
        return count;
    }

    // через метод сравнения букв в словах (гле слово, это гласные буквы)

    public int countVowels (String string) {
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (vowels.contains(String.valueOf(string.charAt(i)).toLowerCase(Locale.ROOT))) {
                count++;
            }
        }
        return count;
    }
}
