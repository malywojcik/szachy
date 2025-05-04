package traproom.szachy;

import java.util.ArrayList;
import java.util.List;

public class Krol extends Figury
{
    public Krol(int x, int y, Szachownica szachownica, boolean bialy)
    {
        super(x, y, szachownica, bialy);
    }

    @Override
    public List<Ruch> mozliwe_pozycje(Szachownica szachownica)
    {
        List<Ruch> mozliweRuchy = new ArrayList<>();

        int[][] kierunki = {
                {0, -1},
                {0, 1},
                {1, 0},
                {-1, 0},
                {-1, -1},
                {1, -1},
                {-1, 1},
                {1, 1}
        };

        for (int[] kier : kierunki)
        {
            int newX = wspX + kier[0];
            int newY = wspY + kier[1];

            if (szachownica.wZakresie(newX, newY))
            {
                Pole pole = szachownica.pola[newX][newY];

                if (pole.zajetePrzezSojusznika(bialy))
                    continue;

                mozliweRuchy.add(new Ruch(wspX, wspY, newX, newY));
            }
        }

        return mozliweRuchy;
    }

    @Override
    public void ruch(int nowyX, int nowyY)
    {
        szachownica.pola[wspX][wspY].figura = null;
        wspX = nowyX;
        wspY = nowyY;
        szachownica.pola[nowyX][nowyY].figura = this;
    }
}