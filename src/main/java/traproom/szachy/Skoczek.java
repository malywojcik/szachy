package traproom.szachy;

import java.util.ArrayList;
import java.util.List;

public class Skoczek extends Figury //kon
{
    public Skoczek(int x, int y, Szachownica szachownica, boolean bialy)
    {
        super(x, y, szachownica, bialy);
    }

    @Override
    public List<Ruch> mozliwe_pozycje(Szachownica szachownica)
    {
        List<Ruch> mozliweRuchy = new ArrayList<>();
        int[][] ruchy = {
            {1, 2}, {2, 1}, {2, -1}, {1, -2},
            {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}
        };

        for (int[] r : ruchy)
        {
            int newX = wspX + r[0];
            int newY = wspY + r[1];
            if (szachownica.wZakresie(newX, newY))
            {
                Pole pole = szachownica.pola[newX][newY];
                if (!pole.zajetePrzezSojusznika(bialy))
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
