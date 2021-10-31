package HW_17_18;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task_8_Test {

    @Test
    public void returnNumberOfList1 () {
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(1);

        Task_8 task8 = new Task_8();
        List<Integer> actualResult = task8.returnNumberOfList("QA 4 Every1");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void returnNumberOfList2 () {
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(5);
        expectedResult.add(3);
        expectedResult.add(7);
        expectedResult.add(8);


        Task_8 task8 = new Task_8();
        List<Integer> actualResult = task8.returnNumberOfList("45 тысяч 378");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void returnNumberOfList3 () {
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(1);

        Task_8 task8 = new Task_8();
        List<Integer> actualResult = task8.returnNumberOfList2("QA 4 Every1");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void returnNumberOfList4 () {
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(5);
        expectedResult.add(3);
        expectedResult.add(7);
        expectedResult.add(8);


        Task_8 task8 = new Task_8();
        List<Integer> actualResult = task8.returnNumberOfList2("45 тысяч 378");

        Assert.assertEquals(expectedResult, actualResult);
    }

}
