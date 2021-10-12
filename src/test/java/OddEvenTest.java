import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class codeTest {


    @Test
    public void OddEvenTest () {
        assertEquals("Odd", Code.OddEven(-345));
        assertEquals("Even", Code.OddEven(0));
        assertEquals("Even", Code.OddEven(222222));
        assertEquals("Undefined",Code.OddEven(2147483647+1));
    }




}
