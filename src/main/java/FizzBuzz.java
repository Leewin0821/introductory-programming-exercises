import java.util.List;

import com.google.common.collect.Lists;

public class FizzBuzz
{
    private String[] numberArray = new String [100];
    private List<String> outputList = Lists.newArrayList();

    public FizzBuzz(int numberSize)
    {
        initialNumberArray(numberSize);
    }

    public void FizzBuzz() {
        for (String stringNumber : numberArray) {
            int index = Integer.parseInt(stringNumber) - 1;
            if ("FizzBuzz\n".equals(replaceFifteen(stringNumber))) {
                numberArray[index] = replaceFifteen(stringNumber);
                break;
            }
            numberArray[index] = replaceFifteen(stringNumber);
            if ("Fizz\n".equals(replaceThree(stringNumber))) {
                numberArray[index] = replaceThree(stringNumber);
                break;
            }
            numberArray[index] = replaceThree(stringNumber);
            if ("Buzz\n".equals(replaceFive(stringNumber))) {
                numberArray[index] = replaceFive(stringNumber);
                break;
            }
            numberArray[index] = replaceFive(stringNumber);
        }
    }

    private void initialNumberArray(int numberSize)
    {
        for (int index = 1; index <= numberSize; index++) {
            numberArray[index-1] = "" + index;
        }
    }

    public String replaceThree(String number)
    {
        if (Integer.parseInt(number) % 3 == 0) {
            return "Fizz\n";
        } else {
            return number + "\n";
        }
    }

    public String replaceFive(String number)
    {
        if (Integer.parseInt(number) % 5 == 0) {
            return "Buzz\n";
        } else {
            return number + "\n";
        }
    }

    public String replaceFifteen(String number)
    {
        if (Integer.parseInt(number) % 5 == 0 && Integer.parseInt(number) % 3 == 0) {
            return "FizzBuzz\n";
        } else {
            return number + "\n";
        }
    }

    public String[] getNumberArray() {
        return numberArray;
    }
}
