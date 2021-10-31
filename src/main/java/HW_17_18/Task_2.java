package HW_17_18;

public class Task_2 {

    /* Написать метод, который принимает строку и
    возвращает строку, которая состоит только из
    букв на нечетных индексах (для построения новой
    строки использовать метод concat() или просто +):

    Test Data:
    “QAForEveryone” -> “AoEeyn”
    “JavaLessonsAreFun” -> “aaesnAeu”

    */

    public String oddIndexLetter(String string) {
        String result = "";
        if (string == null || string.length() == 0) {
            return "Noting to print, string is empty";
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (i % 2 != 0) {
                    result = result.concat(String.valueOf(string.charAt(i)));
                }

            }
        }
        return result;
    }

    // Второй способ шагать по нечетному индексу

    public String oddIndexLetter2 (String string) {
        String result = "";
        if (string == null || string.length() == 0) {
            return "Noting to print, string is empty";
        } else {
            for (int i = 1; i < string.length(); i+=2) {
                result = result.concat(String.valueOf(string.charAt(i)));
            }
        }
        return result;
    }
}
