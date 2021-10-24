import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testascendingSequence1 () {
        int startNumber = 10;
        int endNumber = 25;
        int step = 5;
        int [] expectedResult = {10, 15, 20, 25};

        AscendingSequence ascendingSequenceObject= new AscendingSequence();
        int [] actualResult = ascendingSequenceObject.ascendingSequence(startNumber, endNumber, step);

        Assert.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void testascendingSequence2 () {
        int startNumber =10;
        int endNumber = -25;
        int step = -5;
        int [] expectedResult = {-1};

        AscendingSequence ascendingSequenceObject = new AscendingSequence();
        int [] actualResult = ascendingSequenceObject.ascendingSequence(startNumber,endNumber,step);

        Assert.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testascendingSequence3 () {
        int startNumber =10;
        int endNumber = 10;
        int step = 2;
        int [] expectedResult = {-1};

        AscendingSequence ascendingSequenceObject = new AscendingSequence();
        int [] actualResult = ascendingSequenceObject.ascendingSequence(startNumber,endNumber,step);

        Assert.assertArrayEquals(expectedResult,actualResult);
    }
}
