import java.util.Locale;
public class OddEven {

    public static String oddEven (int number) {
        // Тернарный оператор
        // return number % 2 !=0 ? "Odd" : "Even";
        if (number % 2 == 0) {
            return "Even";
        } else if (number % 2 !=0){
            return "Odd";
        } else {
            return "Undefined";
        }
    }


}
