package traproom.szachy;

public class Szachownica
{
    public Pole[][] pola = new Pole[8][8];

    public Szachownica()
    {
        for(int i=0; i<8; i++)
            for(int j=0; j<8; j++)
                pola[i][j] = new Pole();
    }

    public boolean wZakresie(int x, int y)
    {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }
}