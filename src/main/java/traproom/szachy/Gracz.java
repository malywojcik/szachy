package traproom.szachy;

public class Gracz
{
    private final boolean bialy;        // 1 - bialy; 0 - czarny

    public Gracz(boolean bialy)
    {
        this.bialy = bialy;
    }

    public boolean isBialy()
    {
        return bialy;
    }
}
