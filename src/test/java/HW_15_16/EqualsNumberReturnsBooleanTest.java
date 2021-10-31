package HW_15_16;

import org.junit.Assert;
import org.junit.Test;

public class EqualsNumberReturnsBooleanTest {

    @Test
    public void testEqualsNumberReturnsBoolean1 () {
        Assert.assertTrue(EqualsNumberReturnsBoolean.equalsNumberReturnsBoolean(555));
    }

    @Test
    public void testEqualsNumberReturnsBoolean2 () {
        Assert.assertTrue(EqualsNumberReturnsBoolean.equalsNumberReturnsBoolean(0));
    }

    @Test
    public void testEqualsNumberReturnsBoolean3 () {
        Assert.assertFalse(EqualsNumberReturnsBoolean.equalsNumberReturnsBoolean(-555));

    }
}
