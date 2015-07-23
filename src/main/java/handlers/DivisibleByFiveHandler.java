package handlers;

public class DivisibleByFiveHandler extends DivisibleHandler
{
    @Override
    public String handleRequest(int number)
    {
        if (number % 5 == 0) {
            return "Buzz\n";
        } else {
            return ""+number+"\n";
        }
    }
}
