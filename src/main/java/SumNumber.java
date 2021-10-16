public class SumNumber {
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
                sum = sum -i;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        System.out.println(sumNumber(-10));
    }



}

