package HW_17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task_5_Test {

    @Test
    public void testRemoveSpaceLowerCase1 () {
        String expectedResult = "qaforeveryone";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase("QA For  Everyone ");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase2 () {
        String expectedResult = "javalessonsarefun";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase(" Java lessons  are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase3 () {
        String expectedResult = "Noting to print, string is empty";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase("");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase4 () {
        String expectedResult = "Noting to print, string is empty";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase(null);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase5 () {
        String expectedResult = "qaforeveryone";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase2("QA For  Everyone ");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase6 () {
        String expectedResult = "javalessonsarefun";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase2(" Java lessons  are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase7 () {
        String expectedResult = "Noting to print, string is empty";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase2("");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase8 () {
        String expectedResult = "Noting to print, string is empty";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase2(null);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase9 () {
        String expectedResult = "qaforeveryone";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase3("QA For  Everyone ");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase10 () {
        String expectedResult = "javalessonsarefun";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase3(" Java lessons  are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase11 () {
        String expectedResult = "Noting to print, string is empty";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase3("");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase12 () {
        String expectedResult = "Noting to print, string is empty";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase3(null);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase13 () {
        String expectedResult = "qaforeveryone";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase4("QA For  Everyone ");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase14 () {
        String expectedResult = "javalessonsarefun";

        Task_5 task5 = new Task_5();
        String actualResult = task5.removeSpaceLowerCase4(" Java lessons  are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }
}
