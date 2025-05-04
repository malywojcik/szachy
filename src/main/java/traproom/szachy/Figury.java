package traproom.szachy;

import java.util.List;

public abstract class Figury
{
    public int wspX, wspY;
    public boolean bialy; // 0 - czarny ; 1 - biały
    public Szachownica szachownica;

    public Figury(int wspX, int wspY, Szachownica szachownica, boolean bialy)
    {
        this.wspX = wspX;
        this.wspY = wspY;
        this.bialy = bialy;
        this.szachownica = szachownica;
        szachownica.pola[wspX][wspY].figura = this;
    }

    public abstract List<Ruch> mozliwe_pozycje(Szachownica szachownica);
    public abstract void ruch(int NowyX, int nowyY);
}