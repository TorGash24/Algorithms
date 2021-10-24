public class FizzBuzzWoofNew {
    public boolean divisibleBy (int a, int i) {
        if (i % a ==0) {
            return true;
        }
        return false;
    }
    public boolean contains (int a, int i) {
        if (i % 10 == a && i / 10 == a || i % 10 == a || i / 10 ==a) {
            return true;
        }
        return false;
    }

    public boolean containsDouble (int a, int i) {
        if (i % 10 == a && i / 10 ==a ) {
            return true;
        }
        return false;
    }

    public String returnString (int n) {
        String result = "";

        if (n > 1 && n <100) {
            for (int i = 1; i <=n; i++) {
                if (!divisibleBy(3,i) && !divisibleBy(5,i) && !divisibleBy(7,i) && !contains(3,i) && !contains(5,i) && !contains(7,i)) {
                    result = result + i;
                }
                if (divisibleBy(3,i)) {
                    result += "Fizz";
                }
                if (contains(3,i)) {
                    result += "Fizz";
                }
                if (containsDouble(3,i)) {
                    result += "Fizz";
                }
                if (divisibleBy(5,i)) {
                    result += "Buzz";
                }
                if (contains(5,i)) {
                    result += "Buzz";
                }
                if (containsDouble(5,i)) {
                    result += "Buzz";
                }
                if (divisibleBy(7,i)) {
                    result += "Buzz";
                }
                if (contains(7,i)) {
                    result += "Buzz";
                }
                if (containsDouble(7,i)) {
                    result += "Buzz";
                }
                result += " ";
            }
        }
        return result;
    }
}
