import org.junit.Assert;
import org.junit.Test;

public class EqualsTwoNumberIntTest {

    @Test
    public void testEqualsTwoNumberInt1 () {
        Assert.assertEquals(0, EqualsTwoNumberInt.equalsTwoNumberInt(89,89));
        Assert.assertEquals(-1, EqualsTwoNumberInt.equalsTwoNumberInt(-89,89));
        Assert.assertEquals(1, EqualsTwoNumberInt.equalsTwoNumberInt(89,-89));
    }

    @Test
    public void testEqualsTwoNumberInt2 () {
        Assert.assertEquals(0, EqualsTwoNumberInt.equalsTwoNumberInt2(89,89));
        Assert.assertEquals(-1, EqualsTwoNumberInt.equalsTwoNumberInt2(-89,89));
        Assert.assertEquals(1, EqualsTwoNumberInt.equalsTwoNumberInt2(89,-89));
    }

}
