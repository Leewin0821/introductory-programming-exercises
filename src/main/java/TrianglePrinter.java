import org.apache.commons.lang3.StringUtils;

public class TrianglePrinter
{

    public String returnSingleAsterisk()
    {
        return "*";
    }

    public String returnHorizontalLine(final int LINE_NUMBER)
    {
        String triAngle = "";
        for (int index = 0; index < LINE_NUMBER; index++) {
            triAngle += "*";
        }
        return triAngle;
    }

    public String returnVerticalLine(int LINE_NUMBER)
    {
        final String BREAK_SYMBOL = "/n";
        String triAngle = "";
        for (int index = 0; index < LINE_NUMBER; index++) {
            triAngle += "*/n";
        }
        return StringUtils.removeEnd(triAngle, BREAK_SYMBOL);
    }
}
