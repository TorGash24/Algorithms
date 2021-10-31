package HW_17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task_1_Test {

    @Test
    public void testReturnLetters1 () {
        String expectedResult = "Qorro";

        Task_1 task1 = new Task_1();
        String actualResult =task1.returnLetters("QAForEveryone");

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testReturnLetters2 () {
        String expectedResult = "or";

        Task_1 task1 = new Task_1();
        String actualResult = task1.returnLetters("Java lessons are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }

}
