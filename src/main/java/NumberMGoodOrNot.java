public class NumberMGoodOrNot {

    public static String numberMGoodOrNot (int number) {
        if (number % 3 ==0 && number % 5 ==0) {
            return "Good Number";
        } else if (number % 3 ==0 && number % 5 != 0) {
            return "Bad Number";
        } else if (number % 5 ==0 && number % 3 !=0) {
            return "Poor Number";
        } else {
            return "-1";
        }
    }

    public static void main(String[] args) {
        System.out.println(numberMGoodOrNot(7));
    }
}
