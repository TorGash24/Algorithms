import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayIndexOddTest {

    @Test
    public void arrayIndexOddTest () {
        Assert.assertArrayEquals(new int[] {590, 985, 68}, ArrayIndexOdd.arrayIndexOdd(new int[] {-45, 590, 234, 985, 12, 68}));
    }
}
