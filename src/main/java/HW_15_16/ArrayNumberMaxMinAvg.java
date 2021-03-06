package HW_15_16;

public class ArrayNumberMaxMinAvg {

    public int [] arrayNumberMaxMinAvg (int [] array) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max= array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min= array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int [] newArray = new int[3];
        newArray[0] = max;
        newArray[1] = min;
        newArray[2] = sum /array.length;

        return newArray;
    }
}
