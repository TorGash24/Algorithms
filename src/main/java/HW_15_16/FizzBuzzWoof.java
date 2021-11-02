package HW_15_16;

import java.util.Arrays;

public class FizzBuzzWoof {

    //FizzBuzzWoof

    //Print integers 1 to N, 1 < N < 100
    // but print:
    // “Fizz” if an integer is divisible by 3
    // “Fizz” if an integer contains 3,
    // “Buzz” if an integer is divisible by 5
    // “Buzz” if an integer contains 5,
    // “Woof” if an integer is divisible by 7
    // “Woof” if an integer contains 7

    //Fizz Buzz Woof: одна вариация расширилась до такой степени,
    //что получила собственное имя.
    //В этом случае число 3 становится Fizz,
    //5 становится Buzz,
    //а 7 становится Woof.
    //Основные правила в этой игре: любое число,
    //которое содержит число или делится на это число, заменяется вхождением слова.
    //Если число имеет 2 экземпляра этого числа (т. Е. 33 или 55) и делится на это число,
    //то слово произносится в этом примере три раза.

    public static boolean isDigitPresent (int n, int number) {
        while (n > 0) {
            if (n % 10 == number) {
                break;
            }
            n = n / 10;
        }
        return n >0;
    }


    public static String fizzBuzzWoofNumber (int n) {
        int number3 = 3;
        int number5 = 5;
        int number7 = 7;

        String result = "";

        if ( n > 100) {
            return "Ошибка!!! ВВедите число от 1 до 100";
        }
        if (n % number3 == 0) {
            result += "Fizz";
        }
        if (FizzBuzzWoof.isDigitPresent(n, number3)) {
            result += "Fizz";
        }
        if (n % number5 == 0) {
            result += "Buzz";
        }
        if (FizzBuzzWoof.isDigitPresent(n, number5)) {
            result += "Buzz";
        }
        if (n % number7 == 0) {
            result += "Woff";
        }
        if (FizzBuzzWoof.isDigitPresent(n, number7)) {
            result += "Woff";
        }
        return result;
    }
    public String [] fizzBuzzWoof (int n) {
        String [] array = new String[n];
        String result = "";

        for (int i = 0; i < array.length; i++) {
            String text = FizzBuzzWoof.fizzBuzzWoofNumber(i + 1);
            if (text.equals("")) {
                result = Integer.toString((i + 1));
            } else {
                result = text;
            }
            array[i] = result;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
