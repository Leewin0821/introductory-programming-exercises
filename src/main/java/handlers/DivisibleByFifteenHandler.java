package handlers;

public class DivisibleByFifteenHandler extends DivisibleHandler
{
    @Override
    public void handleRequest(int number)
    {
        if (number % 15 == 0) {
            //do something
            return;
        } else {
            getHandler().handleRequest(number);
        }
    }
}
