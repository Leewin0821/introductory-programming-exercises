package handlers;

public class DivisibleByFifteenHandler extends DivisibleHandler
{
    @Override
    public String handleRequest(int number)
    {
        if (number % 15 == 0) {
            return "FizzBuzz\n";
        } else {
            return getHandler().handleRequest(number);
        }
    }
}
