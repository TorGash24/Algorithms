import org.junit.Assert;
import org.junit.Test;

public class NumberMGoodOrNotTest {


    @Test
    public void testNumberMGoodOrNot1 () {
        Assert.assertEquals("Good Number", NumberMGoodOrNot.numberMGoodOrNot(15));
    }

    @Test
    public void testNumberMGoodOrNot2 () {
        Assert.assertEquals("Poor Number", NumberMGoodOrNot.numberMGoodOrNot(5));
    }

    @Test
    public void testNumberMGoodOrNot3 () {
        Assert.assertEquals("Bad Number", NumberMGoodOrNot.numberMGoodOrNot(9));
    }

    @Test
    public void testNumberMGoodOrNot4 () {
        Assert.assertEquals("-1", NumberMGoodOrNot.numberMGoodOrNot(7));
    }




}
