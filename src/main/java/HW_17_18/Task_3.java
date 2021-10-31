package HW_17_18;

public class Task_3 {

    /* Написать метод, который принимает строку и заменяет все цифры 0 на букву “o”.
        Test Data:
        “QAF0rEvery0ne” -> “QAForEveryone” ”
        “Java less0ns are fun” -> “Java lessons are fun”
    */

    public String numberToLetter (String string) {
        String result = "";
        if (string == null || string.length() == 0) {
            return "Noting to print, string is empty";
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '0') {
                    result += 'o';
                } else {
                    result += string.charAt(i);
                }
            }
        }
        return result;
    }

    // втрой способ заменить чило 0 на букву о

    public String numberToLetter2 (String string) {
        String result = "";
        if (string == null || string.length() == 0) {
            return "Noting to print, string is empty";
        } else {
            result += string.replace('0', 'o');
        }
        return result;
    }
}
