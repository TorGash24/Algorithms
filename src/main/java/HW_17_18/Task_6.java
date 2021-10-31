package HW_17_18;

import java.util.Locale;

public class Task_6 {

    /* Написать метод, который переведет строку
    в upper case и уберет все ЛИШНИЕ пробелы
        Test Data:
        “QA For  Everyone ” -> “QA FOR EVERYONE”
        “ Java lessons  are fun” -> “JAVA LESSONS ARE FUN”
    */

//    public String removeSpaceUpperCase1 (String string) {
//        String result = "";
//        if (string == null || string.length() == 0) {
//            return "Noting to print, string is empty";
//        } else {
//            for (int i = 0; i < string.length(); i++) {
//                if (string.charAt(i) == ' ' && string.charAt(i-1) == ' ') {
//                    continue;
//                } else {
//                    result += string.charAt(i);
//                }
//            }
//        }
//        return result.trim().toUpperCase();
//    }

    // рассмотреть метод strip()

    // метод в одну строку replaceAll(" +", " ") - убирает более одного пробела

    public String removeSpaceUpperCase2 (String string) {
        return string.toUpperCase().replaceAll(" +", " ").trim();

    }
}
