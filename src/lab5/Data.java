package lab5;

public class Data {
    private char symbol;
    private int count;

    public Data (char s)
    {
        symbol=s;
        count=0;
    }

    public void setSymbol(char s)
    {
        symbol=s;
    }

    public char getSymbol()
    {
        return symbol;
    }

    public void incrementCount()
    {
        count++;
    }

    public void setCount(int c)
    {
        if (c>=0)
            count=c;
        else count=0;
    }

    public int getCount()
    {
        return count;
    }
}