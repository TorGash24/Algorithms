public class EqualsNumberReturnsBoolean {

    public static boolean equalsNumberReturnsBoolean (int number) {
        return (number >= 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(equalsNumberReturnsBoolean(-555));
    }
}
