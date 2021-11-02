package HW_17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task_4_Test {

    @Test
    public void testCountSpace () {
        int expectedResult = 2;

        Task_4 task4 = new Task_4();
        int actualResult = task4.countSpace("QA For Everyone");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberToLetter2 () {
        int expectedResult = 4;

        Task_4 task4 = new Task_4();
        int actualResult = task4.countSpace("Java lessons  are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberToLetter3 () {
        int expectedResult = 0;

        Task_4 task4 = new Task_4();
        int actualResult = task4.countSpace("");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberToLetter4 () {
        int expectedResult = 0;

        Task_4 task4 = new Task_4();
        int actualResult = task4.countSpace(null);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
