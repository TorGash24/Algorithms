import java.util.Arrays;

public class AscendingSequence {
//    public static int [] ascendingSequence (int a, int b, int c){
//        if (b > a && c > 0) {
//            int count =0;
//            int [] array = new int[c-1];
//            for (int i = a; i <= b; i = i + c) {
//                array[count] = i;
//                count++;
//            }
//            return  array;
//        }
//        return new int [] {-1};
//
//
//
//    }
    public static int [] ascendingSequence (int a, int b, int c){
        if (b > a && c > 0) {
            int count = 0;
            int[] array = new int[(b-a) /c +1];
            int i = a;
            while (i <= b) {
                array[count] = i;
                i += c;
                count++;
            }
            return array;
        }
        return new int [] {-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ascendingSequence(10,20,2)));

    }
}
