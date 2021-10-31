package HW_15_16;

public class AscendingSequence {

    /* Написать алгоритм AscendingSequence,
       который строит возрастающую последовательность
       чисел от a до b с шагом n.
     */

    public int [] ascendingSequence (int startNumber, int endNumber, int step){
        if (endNumber <= startNumber || startNumber < 0) {
            return new int[]{-1};
        } else {
            int[] array = new int[(endNumber-startNumber) /step +1];
            int element = startNumber;
            for (int i =0; i < array.length; i++ ) {
                array[i] = element;
                element+= step;
            }
            return array;
        }

    }


}
