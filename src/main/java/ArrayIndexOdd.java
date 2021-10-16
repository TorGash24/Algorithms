import java.util.Arrays;

public class ArrayIndexOdd {

    public static int [] arrayIndexOdd (int [] array) {
        int count = 0;
        int [] newarray = new int[3];
        for (int i =0; i < array.length; i++) {
            if (i % 2 !=0) {
                newarray[count] = array[i];
                count++;
            }
        }
        return newarray;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayIndexOdd(new int[] {-45, 590, 234, 985, 12, 68})));
    }

}
