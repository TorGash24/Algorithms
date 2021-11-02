package HW_17_18;

public class Task_1 {
    /* Написать метод, который принимает на вход строку и печатает все буквы “q”, “o” и “r” из этой строки:
        Test Data
        “QAForEveryone”
        “Java lessons are fun”
    */
    public String returnLetters(String string) {
        String result = "";
        if (string == null || string.length() == 0) {
            return "Noting to print, string is empty";
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (string.toLowerCase().charAt(i) == 'q' || string.toLowerCase().charAt(i) == 'r' || string.toLowerCase().charAt(i) == 'o') {
                    result += string.toLowerCase().charAt(i);
                }
            }
        }
        return result;
    }
}
