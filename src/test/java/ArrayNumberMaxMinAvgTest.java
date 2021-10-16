import org.junit.Assert;
import org.junit.Test;

public class ArrayNumberMaxMinAvgTest {

    @Test
    public void arrayNumberMaxMinAvgTest () {
        Assert.assertArrayEquals(new int[] {5, 1, 3}, ArrayNumberMaxMinAvg.arrayNumberMaxMinAvg(new int[] {1, 2, 3, 4, 5}));
        Assert.assertArrayEquals(new int[] {1003, -39, 223}, ArrayNumberMaxMinAvg.arrayNumberMaxMinAvg(new int[] {-3, 0, 155, -39, 1003}));
    }
}
