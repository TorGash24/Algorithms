package HW_15_16;

import org.junit.Assert;
import org.junit.Test;

public class EqualsTwoNumberTest {

    @Test
    public void equalsTwoNumberTest() {
        Assert.assertEquals(9999, EqualsTwoNumber.equalsTwoNumber(3333,9999));
        Assert.assertEquals(1, EqualsTwoNumber.equalsTwoNumber(1,1));
    }

}
