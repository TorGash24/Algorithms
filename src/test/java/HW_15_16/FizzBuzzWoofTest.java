package HW_15_16;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzWoofTest {


    @Test
    public void testFizzBuzzWoff () {
        int n =33;
        String[] expectedResult = {"1", "2", "FizzFizz", "4", "BuzzBuzz", "Fizz", "WoffWoff", "8",
                "Fizz", "Buzz", "11", "Fizz", "Fizz", "Woff", "FizzBuzzBuzz", "16", "Woff",
                "Fizz", "19", "Buzz", "FizzWoff", "22", "Fizz", "Fizz", "BuzzBuzz", "26", "FizzWoff",
                "Woff", "29", "FizzFizzBuzz", "Fizz", "Fizz", "FizzFizz"};

        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String[] actualResult =fizzBuzzWoof.fizzBuzzWoof(n);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }
}
