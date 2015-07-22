package handlers;

public class DivisibleByThreeHandler extends DivisibleHandler
{
    @Override
    public void handleRequest(int number)
    {
        if (number % 3 == 0) {
            //do something
            return;
        } else {
            getHandler().handleRequest(number);
        }
    }
}
