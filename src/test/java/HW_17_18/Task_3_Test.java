package HW_17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task_3_Test {

    @Test
    public void testNumberToLetter1 () {
        String expectedResult = "QAForEveryone";

        Task_3 task3 = new Task_3();
        String actualResult = task3.numberToLetter("QAF0rEvery0ne");

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testNumberToLetter2 () {
        String expectedResult = "Java lessons are fun";

        Task_3 task3 = new Task_3();
        String actualResult = task3.numberToLetter("Java less0ns are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testNumberToLetter3 () {
        String expectedResult = "Noting to print, string is empty";

        Task_3 task3 = new Task_3();
        String actualResult = task3.numberToLetter("");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberToLetter4 () {
        String expectedResult = "Noting to print, string is empty";

        Task_3 task3 = new Task_3();
        String actualResult = task3.numberToLetter(null);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberToLetter5 () {
        String expectedResult = "QAForEveryone";

        Task_3 task3 = new Task_3();
        String actualResult = task3.numberToLetter2("QAF0rEvery0ne");

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testNumberToLetter6 () {
        String expectedResult = "Java lessons are fun";

        Task_3 task3 = new Task_3();
        String actualResult = task3.numberToLetter2("Java less0ns are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testNumberToLetter7 () {
        String expectedResult = "Noting to print, string is empty";

        Task_3 task3 = new Task_3();
        String actualResult = task3.numberToLetter2("");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberToLetter8 () {
        String expectedResult = "Noting to print, string is empty";

        Task_3 task3 = new Task_3();
        String actualResult = task3.numberToLetter2(null);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
