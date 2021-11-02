package HW_15_16;

import org.junit.Assert;
import org.junit.Test;

public class SumNumberTest {

    @Test
    public void sumNumberTest () {
        Assert.assertEquals(24753, SumNumber.sumNumber(222));
        Assert.assertEquals(56, SumNumber.sumNumber(-10));
    }
}
