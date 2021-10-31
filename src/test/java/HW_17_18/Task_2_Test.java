package HW_17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task_2_Test {

    @Test
    public void testOddIndexLetter1 () {
        String expectedResult = "AoEeyn";

        Task_2 task2 = new Task_2();
        String actualResult = task2.oddIndexLetter("QAForEveryone");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndexLetter2 () {
        String expectedResult = "aaesnAeu";

        Task_2 task2 = new Task_2();
        String actualResult = task2.oddIndexLetter("JavaLessonsAreFun");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndexLetter3 () {
        String expectedResult = "Noting to print, string is empty";

        Task_2 task2 = new Task_2();
        String actualResult = task2.oddIndexLetter("");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndexLetter4 () {
        String expectedResult = "Noting to print, string is empty";

        Task_2 task2 = new Task_2();
        String actualResult = task2.oddIndexLetter(null);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndexLetter5 () {
        String expectedResult = "AoEeyn";

        Task_2 task2 = new Task_2();
        String actualResult = task2.oddIndexLetter2("QAForEveryone");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndexLetter6 () {
        String expectedResult = "aaesnAeu";

        Task_2 task2 = new Task_2();
        String actualResult = task2.oddIndexLetter2("JavaLessonsAreFun");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndexLetter7 () {
        String expectedResult = "Noting to print, string is empty";

        Task_2 task2 = new Task_2();
        String actualResult = task2.oddIndexLetter2("");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndexLetter8 () {
        String expectedResult = "Noting to print, string is empty";

        Task_2 task2 = new Task_2();
        String actualResult = task2.oddIndexLetter2(null);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
