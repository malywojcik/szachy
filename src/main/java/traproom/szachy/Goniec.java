package traproom.szachy;

import java.util.ArrayList;
import java.util.List;

public class Goniec extends Figury // ten co bokiem lata
{
    public Goniec(int x, int y, Szachownica szachownica, boolean bialy)
    {
        super(x, y, szachownica, bialy);
    }

    @Override
    public List<Ruch> mozliwe_pozycje(Szachownica szachownica)
    {
        List<Ruch> mozliweRuchy = new ArrayList<>();

        int[][] kierunki = {
                {-1, -1}, {1, -1}, {1, 1}, {-1, 1}
        };

        for (int[] kier : kierunki)
        {
            int dx = kier[0];
            int dy = kier[1];
            int newX = wspX + dx;
            int newY = wspY + dy;

            while (szachownica.wZakresie(newX, newY))
            {
                Pole pole = szachownica.pola[newX][newY];

                if (pole.zajetePrzezSojusznika(bialy))
                    break;

                mozliweRuchy.add(new Ruch(wspX, wspY, newX, newY));

                if (pole.zajetePrzezWroga(bialy))
                    break;

                newX += dx;
                newY += dy;
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
