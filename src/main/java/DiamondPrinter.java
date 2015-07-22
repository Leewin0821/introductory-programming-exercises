import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Preconditions;

public class DiamondPrinter
{
    final String break_line = "\n";

    public String produceIsoscelesTriangle(int LINE_NUMBER)
    {
        String message = "";
        for (int index = 1; index <= LINE_NUMBER; index++) {
            message += returnSpaces(LINE_NUMBER - index)+returnAsterisk(2 * index - 1);
        }
        return message;
    }

    private String produceReverseIsoscelesTriangle(int LINE_NUMBER) {
        String message = "";
        for (int index = LINE_NUMBER; index > 0; index--) {
            message += returnSpaces(LINE_NUMBER - index)+returnAsterisk(2 * index - 1);
        }
        return message;
    }

    private void checkLineNumberIsOdd(int LINE_NUMBER)
    {
        String errorMessage = "Line Number must be odd";
        Preconditions.checkArgument(LINE_NUMBER % 2 == 1, errorMessage);
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
        checkLineNumberIsOdd(LINE_NUMBER);
        String originMessage = "";
        originMessage += produceIsoscelesTriangle(LINE_NUMBER);
        String message = StringUtils.removeEnd(originMessage, returnAsterisk(2 * LINE_NUMBER - 1));
        message += produceReverseIsoscelesTriangle(LINE_NUMBER);
        return StringUtils.removeEnd(message, break_line);
    }

    public String returnDiamondWithName(String name, int LINE_NUMBER)
    {
        checkLineNumberIsOdd(LINE_NUMBER);
        String originMessage = "";
        originMessage += produceIsoscelesTriangle(LINE_NUMBER);
        String message = StringUtils.removeEnd(originMessage, returnAsterisk(2 * LINE_NUMBER - 1));
        message += name + "\n";
        message += StringUtils.removeStart(produceReverseIsoscelesTriangle(LINE_NUMBER), returnAsterisk(2 * LINE_NUMBER - 1));
        return StringUtils.removeEnd(message, break_line);
    }

    public String returnIsoscelesTriangle(int LINE_NUMBER)
    {
        return StringUtils.removeEnd(produceIsoscelesTriangle(LINE_NUMBER), break_line);
    }
}
