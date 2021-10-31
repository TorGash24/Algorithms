package HW_15_16;

public class OddEven {

    /* Создать алгоритм OddEven, который примет на вход число, вернет “Odd”,
       если число нечетное, и “Even”, если число четное. Во всех остальных
       случаях результат будет “Undefined”.
     */

    public static String oddEven (long number) {
        // Тернарный оператор
        // return number % 2 !=0 ? "Odd" : "Even";
        if (number > Integer.MIN_VALUE && number < Integer.MIN_VALUE) {
            if (number % 2 == 0) {
                return "Even";
            } else if (number % 2 != 0) {
                return "Odd";
            }


        }
        return "Undefined";
    }


}
