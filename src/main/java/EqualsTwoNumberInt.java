public class EqualsTwoNumberInt {

    /* Напишите метод, который принимает на вход 2 любых int числа, и возвращает
     0, если числа равны
     -1, если первое число меньше второго
     1, если первое число больше второго
     */

    public static int equalsTwoNumberInt (int number1, int number2) {
        if (number1 == number2) {
            return 0;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 1;
        }
    }

    public static int equalsTwoNumberInt2 (int number1, int number2) {
        return number1 == number2 ? 0 : number1 > number2 ? 1 : -1;
    }


}
