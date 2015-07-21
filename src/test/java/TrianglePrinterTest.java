import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrianglePrinterTest
{
    private TrianglePrinter trianglePrinter;

    @BeforeMethod
    public void setUp() throws Exception
    {
        trianglePrinter = new TrianglePrinter();
    }

    @Test
    public void shouldReturnSingleAsterisk()
    {
        //given
        final String SINGLE_ASTERISK = "*";

        //when
        String result = trianglePrinter.returnSingleAsterisk();

        //then
        assertEquals(result, SINGLE_ASTERISK);
    }

    @Test
    public void shouldReturnHorizontalLineWithSpecificNumber()
    {
        //given
        final int LINE_NUMBER = 8;
        String expected = "********";

        //when
        String result = trianglePrinter.returnHorizontalLine(LINE_NUMBER);

        //then
        assertEquals(result, expected);
    }

    @Test
    public void shouldReturnVerticalLineWithSpecificNumber()
    {
        //given
        final int LINE_NUMBER = 3;
        String expected = "*/n*/n*";

        //when
        String result = trianglePrinter.returnVerticalLine(LINE_NUMBER);

        //then
        assertEquals(result, expected);
    }
}