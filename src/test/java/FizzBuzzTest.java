import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FizzBuzzTest
{
    private FizzBuzz fizzBuzz;

    @BeforeMethod
    public void setUp() throws Exception
    {
        fizzBuzz = new FizzBuzz(100);
    }

    @Test
    public void shouldReturnFizzWhenDivisibleByThree()
    {
        //given
        String FIZZ = "1\n2\nFizz\n";
        int limit = 3;
        String result = "";

        //when
        for (int index=1; index<=limit; index++) {
            String stringIndex = "" + index;
            result += fizzBuzz.replaceThree(stringIndex);
        }

        //then
        assertEquals(result, FIZZ);
    }

    @Test
    public void shouldReturnBuzzWhenDivisibleByFive()
    {
        //given
        String BUZZ = "1\n2\n3\n4\nBuzz\n";
        int limit = 5;
        String result = "";

        //when
        for (int index=1; index<=limit; index++) {
            String stringIndex = "" + index;
            result += fizzBuzz.replaceFive(stringIndex);
        }

        //then
        assertEquals(result, BUZZ);
    }

    @Test
    public void shouldReturnFizzBuzzWhenDivisibleByThreeAndFive()
    {
        //given
        String FIZZBUZZ = "1\n2\n3\n4\n5\n" +
                          "6\n7\n8\n9\n10\n" +
                          "11\n12\n13\n14\n" +
                          "FizzBuzz\n";
        int limit = 15;
        String result = "";

        //when
        for (int index=1; index<=limit; index++) {
            String stringIndex = "" + index;
            result += fizzBuzz.replaceFifteen(stringIndex);
        }

        //then
        assertEquals(result, FIZZBUZZ);
    }

    @Test
    public void testName() throws Exception
    {
        fizzBuzz.FizzBuzz();
        for (int index=0; index<100; index++){
            System.out.println("**"+fizzBuzz.getNumberArray()[index]+"**");
        }

    }
}