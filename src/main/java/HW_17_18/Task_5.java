package HW_17_18;

public class Task_5 {

    /* Написать метод, который удалит все пробелы из
    входящей строки, и заменит все большие буквы на маленькие.
        Test Data:
        “QA For  Everyone ” -> “qaforeveryone”
        “ Java lessons  are fun” -> “javalessonsarefun”
    */

    public String removeSpaceLowerCase (String string) {
        String result = "";
        if (string == null || string.length() == 0) {
            return "Noting to print, string is empty";
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    continue;
                } else {
                    result += string.toLowerCase().charAt(i);
                }
            }
        }
        return result;
    }

    // второй метод через неравенство в условии

    public String removeSpaceLowerCase2 (String string) {
        String result = "";
        if (string == null || string.length() == 0) {
            return "Noting to print, string is empty";
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != ' ') {
                    result += string.toLowerCase().charAt(i);
                }
            }
        }
        return result;
    }

    // третий метод через таблицу ASCII

    public String removeSpaceLowerCase3 (String string) {
        StringBuilder result = new StringBuilder();
        if (string == null || string.length() == 0) {
            return "Noting to print, string is empty";
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != ' ') {
                    if (string.charAt(i) > 64 && string.charAt(i) < 91) {
                        result.append((char) (string.charAt(i)+32));
                    } else {
                        result.append(string.charAt(i));
                    }
                }
            }
        }
        return result.toString();
    }

    // метод в одну строку через метод replaceAll

    public String removeSpaceLowerCase4 (String string) {
        return string.replaceAll(" ","" ).toLowerCase();
    }

    // Сложный метод

    public String aqueeze (String string) {
        char[] a = string.toCharArray();
        int n= 1;
        for (int i = 0; i < a.length; i++) {
            a[n] = a [i];
            if (a[n] != ' ') {
                n++;
            } else if (a [n-1] != ' ') {
                n++;
            }
        }
        return new String(a, 0, n);
    }


}
