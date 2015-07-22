package handlers;

public class DivisibleByFiveHandler extends DivisibleHandler
{
    @Override
    public void handleRequest(int number)
    {
        if (number % 5 == 0) {
            //do something
            return;
        } else {
            //do other thing
        }
    }
}
