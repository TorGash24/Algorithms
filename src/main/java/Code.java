import java.util.Locale;
public class Code {

    public static String OddEven (int number) {
        // Тернарный оператор
        // return number % 2 !=0 ? "Odd" : "Even";
        if (number % 2 != 0) {
            return "Odd";
        } else {
            return "Even";
        }
    }


}
