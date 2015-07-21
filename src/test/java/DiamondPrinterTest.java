import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DiamondPrinterTest
{
    private DiamondPrinter diamondPrinter;

    @BeforeMethod
    public void setUp() throws Exception
    {
        diamondPrinter = new DiamondPrinter();
    }

    @Test
    public void shouldReturnIsoscelesTriangleWithSpecificNumber()
    {
        //given
        final int LINE_NUMBER = 3;
        String expected = "  *"+"\n"+" ***"+"\n"+"*****";

        //when
        String result = diamondPrinter.returnIsoscelesTriangle(LINE_NUMBER);

        //then
        assertEquals(result, expected);
    }

    @Test
    public void shouldReturnDiamondWithSpecificNumber()
    {
        //given
        final int LINE_NUMBER = 3;
        String expected = "  *"+"\n"+" ***"+"\n"+"*****"+"\n"+" ***"+"\n"+"  *";

        //when
        String result = diamondPrinter.returnDiamond(LINE_NUMBER);

        //then
        assertEquals(result, expected);
    }
}