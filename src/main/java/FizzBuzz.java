import handlers.DivisibleByFifteenHandler;
import handlers.DivisibleByFiveHandler;
import handlers.DivisibleByThreeHandler;
import handlers.DivisibleHandler;

public class FizzBuzz
{
    private DivisibleHandler divisibleByFifteenHandler;
    private DivisibleHandler divisibleByThreeHandler;
    private DivisibleHandler divisibleByFiveHandler;

    public FizzBuzz()
    {
        divisibleByFifteenHandler = new DivisibleByFifteenHandler();
        divisibleByThreeHandler = new DivisibleByThreeHandler();
        divisibleByFiveHandler = new DivisibleByFiveHandler();
    }

    public void FizzBuzz() {
        String result = "";

        divisibleByFifteenHandler.setHandler(divisibleByThreeHandler);
        divisibleByThreeHandler.setHandler(divisibleByFiveHandler);

        for (int index = 1; index <= 100; index++) {
            result += divisibleByFifteenHandler.handleRequest(index);
        }

        System.out.println(result);
    }

}
