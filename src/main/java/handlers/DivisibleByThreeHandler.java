package handlers;

public class DivisibleByThreeHandler extends DivisibleHandler
{
    @Override
    public String handleRequest(int number)
    {
        if (number % 3 == 0) {
            return "Fizz\n";
        } else {
            return getHandler().handleRequest(number);
        }
    }
}
