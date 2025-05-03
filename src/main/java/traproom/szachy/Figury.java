package traproom.szachy;

import java.util.List;

public abstract class Figury
{
    public int wspX, wspY;
    public boolean czy_zyje; // 0 - nie ;( ; 1 - tak B)
    public boolean bialy; // 0 - czarny ; 1 - biały
    public Szachownica szachownica;

    public Figury(int wspX, int wspY, boolean bialy, boolean czy_zyje)
    {
        this.wspX = wspX;
        this.wspY = wspY;
        this.bialy = bialy;
        this.czy_zyje = czy_zyje;
    }

    public abstract List<Ruch> mozliwe_pozycje(Szachownica szachownica);
    public abstract void ruch(int NowyX, int nowyY);
}