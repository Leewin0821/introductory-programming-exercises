import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FizzBuzzTest
{
    private FizzBuzz fizzBuzz;

    @BeforeMethod
    public void setUp()
    {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldPrintResults()
    {
        fizzBuzz.FizzBuzz();
    }
}