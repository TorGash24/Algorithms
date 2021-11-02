package HW_15_16;

import org.junit.Assert;
import org.junit.Test;

public class ArrayNumberMaxMinAvgTest {

    @Test
    public void testArrayNumberMaxMinAvg1 () {
        int [] array = {-3, 0, 155, -39, 1003};
        int [] expectedResult = {1003, -39, 223};

        ArrayNumberMaxMinAvg arrayNumberMaxMinAvgObject = new ArrayNumberMaxMinAvg();
        int [] actualResult = arrayNumberMaxMinAvgObject.arrayNumberMaxMinAvg(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testArrayNumberMaxMinAvg2 () {
        int [] array = {1, 2, 3, 4, 5};
        int [] expectedResult = {5, 1, 3};

        ArrayNumberMaxMinAvg arrayNumberMaxMinAvgObject = new ArrayNumberMaxMinAvg();
        int [] actualResult = arrayNumberMaxMinAvgObject.arrayNumberMaxMinAvg(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
