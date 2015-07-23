package handlers;

public abstract class DivisibleHandler
{
    protected DivisibleHandler handler;

    public void setHandler(DivisibleHandler handler) {
        this.handler = handler;
    }

    public DivisibleHandler getHandler() {
        return handler;
    }

    public abstract String handleRequest(int number);
}
