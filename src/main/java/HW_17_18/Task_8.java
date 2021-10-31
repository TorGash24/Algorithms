package HW_17_18;

import java.util.ArrayList;
import java.util.List;

public class Task_8 {

    /* Написать метод, который все цифры из
       входящей строки вернет в виде List<Integer>.
        Test Data:
        “QA 4 Every1” -> [4, 1]
        “45 тысяч 378” -> [4, 5, 3, 7, 8]
    */

    public static List<Integer> returnNumberOfList (String string) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (47 < string.charAt(i) && string.charAt(i) < 58) {
                list.add(Character.getNumericValue(string.charAt(i)));
            }
        }
        return list;
    }

    // второй метод (string.charAt(i) - 48) - переводим Char в Integer

    public static List<Integer> returnNumberOfList2 (String string) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (47 < string.charAt(i) && string.charAt(i) < 58) {
                list.add(string.charAt(i) - 48);
            }
        }
        return list;
    }
}
