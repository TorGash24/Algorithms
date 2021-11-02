package HW_17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task_7_Test {

    @Test
    public void countVowelsLetters1 () {
        int expectedResult = 6;

        Task_7 task7 = new Task_7();
        int actualResult = task7.countVowelsLetters1("QA For Everyone");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countVowelsLetters2 () {
        int expectedResult = 7;

        Task_7 task7 = new Task_7();
        int actualResult = task7.countVowelsLetters1("Java lessons are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countVowelsLetters3 () {
        int expectedResult = -1;

        Task_7 task7 = new Task_7();
        int actualResult = task7.countVowelsLetters1("");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countVowelsLetters4 () {
        int expectedResult = -1;

        Task_7 task7 = new Task_7();
        int actualResult = task7.countVowelsLetters1(null);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countVowelsLetters5 () {
        int expectedResult = 6;

        Task_7 task7 = new Task_7();
        int actualResult = task7.countVowelsLetters2("QA For Everyone");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countVowelsLetters6 () {
        int expectedResult = 7;

        Task_7 task7 = new Task_7();
        int actualResult = task7.countVowelsLetters2("Java lessons are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countVowelsLetters7 () {
        int expectedResult = 6;

        Task_7 task7 = new Task_7();
        int actualResult = task7.countVowels("QA For Everyone");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countVowelsLetters8 () {
        int expectedResult = 7;

        Task_7 task7 = new Task_7();
        int actualResult = task7.countVowels("Java lessons are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }

}
