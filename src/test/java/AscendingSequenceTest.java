import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void ascendingSequenceTest () {
        Assert.assertArrayEquals(new int [] {10,15,20,25}, AscendingSequence.ascendingSequence(10, 25, 5));
        Assert.assertArrayEquals(new int [] {-1}, AscendingSequence.ascendingSequence(10, -25, -5));
        Assert.assertArrayEquals(new int [] {-1}, AscendingSequence.ascendingSequence(10, 10, 2));
    }
}
