import static org.testng.Assert.*;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.Lists;

public class PrimeFactorGeneratorTest
{
    private PrimeFactorGenerator primeFactorGenerator;

    @BeforeMethod
    public void setUp() throws Exception
    {
        primeFactorGenerator = new PrimeFactorGenerator();
    }

    @Test
    public void shouldReturnCorrectPrimeFactorForSpecificInteger() throws Exception
    {
        //given
        int number = 30;
        List<Integer> expectedList = Lists.newArrayList(2, 3, 5);

        //when
        List<Integer> resultList = primeFactorGenerator.generate(number);

        //then
        assertEquals(resultList.size(), expectedList.size());
        assertEquals(resultList.get(0), expectedList.get(0));
        assertEquals(resultList.get(1), expectedList.get(1));
        assertEquals(resultList.get(2), expectedList.get(2));
    }
}