package HW_17_18;

public class Task_1 {
    /* Написать метод, который принимает на вход строку и печатает все буквы “q”, “o” и “r” из этой строки:
        Test Data
        “QAForEveryone”
        “Java lessons are fun”
    */
    public String returnLetters (String string) {
        StringBuilder result = new StringBuilder();
        if (string.length() == 0) {
            return null;
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.toLowerCase().charAt(i) == 'q') {
                result.append(string.charAt(i));
            }
            if (string.toLowerCase().charAt(i) == 'o') {
                result.append(string.charAt(i));
            }
            if (string.toLowerCase().charAt(i) == 'r') {
                result.append(string.charAt(i));
            }
        }
        return String.valueOf(result);
    }
}
