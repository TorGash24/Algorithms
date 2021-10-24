import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class OddEvenTest {


    @Test
    public void oddEvenTest () {
        assertEquals("Odd", OddEven.oddEven(-345));
        assertEquals("Even", OddEven.oddEven(0));
        assertEquals("Even", OddEven.oddEven(222222));
        assertEquals("Undefined", OddEven.oddEven(2147483647L + 1));
    }




}
