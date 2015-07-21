import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Preconditions;

public class DiamondPrinter
{
    final String break_line = "\n";

    public String returnIsoscelesTriangle(int LINE_NUMBER)
    {
        String errorMessage = "Line Number must be odd";
        String message = "";
        Preconditions.checkArgument(LINE_NUMBER % 2 == 1, errorMessage);
        for (int index = 1; index <= LINE_NUMBER; index++) {
            message += returnSpaces(LINE_NUMBER - index)+returnAsterisk(2 * index - 1);
        }

        return StringUtils.removeEnd(message, break_line);
    }

    private String returnAsterisk(int number)
    {
        String asterisks = "";
        for (int index=0; index < number; index++) {
            asterisks += "*";
        }
        return asterisks+ break_line;
    }

    private String returnSpaces(int number)
    {
        String spaces = "";
        for (int index = 0; index < number; index++) {
            spaces += " ";
        }
        return spaces;
    }

    public String returnDiamond(int LINE_NUMBER)
    {
        String errorMessage = "Line Number must be odd";
        String message = "";
        Preconditions.checkArgument(LINE_NUMBER % 2 == 1, errorMessage);
        for (int index = 1; index <= LINE_NUMBER*2-1; index++) {
            message += returnSpaces(Math.abs(LINE_NUMBER - index)) +
                       returnAsterisk(LINE_NUMBER*2-1-2*Math.abs(LINE_NUMBER-index));
        }

        return StringUtils.removeEnd(message, break_line);
    }
}
