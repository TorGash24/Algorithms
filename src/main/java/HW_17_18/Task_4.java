package HW_17_18;

public class Task_4 {

    /* Написать метод, который принимает строку,
    и возвращает количество пробелов в этой строке
        Test Data:
        “QA For Everyone” -> 2
        “Java lessons  are fun” -> 4
    */

    public int countSpace (String string) {
        int count = 0;
        if (string == null || string.length() == 0) {
            return 0;
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    count += 1;
                }
            }
        }
        return count;
    }
}
