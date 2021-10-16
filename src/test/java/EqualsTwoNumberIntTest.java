import org.junit.Assert;
import org.junit.Test;

public class EqualsTwoNumberIntTest {

    @Test
    public void equalsTwoNumberIntTest () {
        Assert.assertEquals(0, EqualsTwoNumberInt.equalsTwoNumberInt(89,89));
        Assert.assertEquals(-1, EqualsTwoNumberInt.equalsTwoNumberInt(-89,89));
        Assert.assertEquals(1, EqualsTwoNumberInt.equalsTwoNumberInt(89,-89));
    }
}
