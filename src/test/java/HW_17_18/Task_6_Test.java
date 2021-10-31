package HW_17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task_6_Test {

//    @Test
//    public void testRemoveSpaceUpperCase1 () {
//        String expectedResult = "QA FOR EVERYONE";
//
//        Task_6 task6 = new Task_6();
//        String actualResult = task6.removeSpaceUpperCase1("QA For  Everyone ");
//
//        Assert.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void testRemoveSpaceLowerCase2 () {
//        String expectedResult = "JAVA LESSONS ARE FUN";
//
//        Task_6 task6 = new Task_6();
//        String actualResult = task6.removeSpaceUpperCase1(" Java lessons  are fun");
//
//        Assert.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void testRemoveSpaceLowerCase3 () {
//        String expectedResult = "Noting to print, string is empty";
//
//        Task_6 task6 = new Task_6();
//        String actualResult = task6.removeSpaceUpperCase1("");
//
//        Assert.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void testRemoveSpaceLowerCase4 () {
//        String expectedResult = "Noting to print, string is empty";
//
//        Task_6 task6 = new Task_6();
//        String actualResult = task6.removeSpaceUpperCase1(null);
//
//        Assert.assertEquals(expectedResult, actualResult);
//    }

    @Test
    public void testRemoveSpaceUpperCase5 () {
        String expectedResult = "QA FOR EVERYONE";

        Task_6 task6 = new Task_6();
        String actualResult = task6.removeSpaceUpperCase2("QA For  Everyone ");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase6 () {
        String expectedResult = "JAVA LESSONS ARE FUN";

        Task_6 task6 = new Task_6();
        String actualResult = task6.removeSpaceUpperCase2(" Java lessons  are fun");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase7 () {
        String expectedResult = "Noting to print, string is empty";

        Task_6 task6 = new Task_6();
        String actualResult = task6.removeSpaceUpperCase2("");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceLowerCase8 () {
        String expectedResult = "Noting to print, string is empty";

        Task_6 task6 = new Task_6();
        String actualResult = task6.removeSpaceUpperCase2(null);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
