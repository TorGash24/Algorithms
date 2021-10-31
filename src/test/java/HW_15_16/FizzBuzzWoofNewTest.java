package HW_15_16;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzWoofNewTest {

    @Test
    public void testFizzBuzzWoofNew () {
        int n =33;
        String expectedResult = "1 2 FizzFizz 4 BuzzBuzz Fizz BuzzBuzz 8 Fizz Buzz 11 Fizz Fizz Buzz FizzBuzzBuzz 16 Buzz Fizz 19 Buzz FizzBuzz 22 Fizz Fizz BuzzBuzz 26 FizzBuzz Buzz 29 FizzFizzBuzz Fizz Fizz FizzFizzFizz ";

        FizzBuzzWoofNew fizzBuzzWoofNew = new FizzBuzzWoofNew();
        String actualResult =fizzBuzzWoofNew.returnString(n);
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
