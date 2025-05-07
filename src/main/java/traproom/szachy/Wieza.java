package traproom.szachy;

import java.util.ArrayList;
import java.util.List;

public class Wieza extends Figury // t-pose
{
    private boolean ruszony = false;

    public Wieza(int x, int y, Szachownica szachownica, boolean bialy)
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
                {-1, 0}
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
        // roszada
        if (!ruszony && Math.abs(nowyX - wspX) >= 2)
        {
            Krol king = (Krol) szachownica.pola[4][wspY].figura;
            if (wspX == 7 && nowyX == 5)
            {
                szachownica.pola[4][wspY].figura = null;
                szachownica.pola[6][wspY].figura = king;
                king.wspX = 6;
                king.setMoved(true);
            }

            else if (wspX == 0 && nowyX == 3)
            {
                szachownica.pola[4][wspY].figura = null;
                szachownica.pola[2][wspY].figura = king;
                king.wspX = 2;
                king.setMoved(true);
            }
        }

        szachownica.pola[wspX][wspY].figura = null;
        wspX = nowyX;
        wspY = nowyY;
        szachownica.pola[nowyX][nowyY].figura = this;
        ruszony = true;
    }

    public boolean isMoved()
    {
        return ruszony;
    }

    public void setMoved(boolean ruszony)
    {
        this.ruszony = ruszony;
    }
}
