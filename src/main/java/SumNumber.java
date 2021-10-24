public class SumNumber {

    /* Написать алгоритм, который возвращает сумму всех чисел от 1 до n,
    если последовательность чисел возрастающая; и возвращает разницу
    всех чисел, если последовательность чисел убывающая.
    Test Data:
    n = 222;
    Expected result = 24 753
    n = -10;
    Expected result = 56;
    */

    public static int sumNumber (int n) {
        if (n >= 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        } else {
            int sum = 2;
            for (int i = 1; i >= n; i--) {
                sum -= i;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        System.out.println(sumNumber(222));
    }



}

