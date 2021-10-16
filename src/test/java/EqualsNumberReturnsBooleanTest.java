import org.junit.Assert;
import org.junit.Test;

public class EqualsNumberReturnsBooleanTest {

    @Test
    public void equalsNumberReturnsBooleanTest () {
        Assert.assertEquals(true, EqualsNumberReturnsBoolean.equalsNumberReturnsBoolean(555));
        Assert.assertEquals(true, EqualsNumberReturnsBoolean.equalsNumberReturnsBoolean(0));
        Assert.assertEquals(false, EqualsNumberReturnsBoolean.equalsNumberReturnsBoolean(-555));

    }
}
