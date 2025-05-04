package traproom.szachy;

import java.util.ArrayList;
import java.util.List;

public class Krol extends Figury
{
    private boolean ruszony = false;

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
        // Handle castling
        if (!ruszony && Math.abs(nowyX - wspX) == 2) // Castling move
        {
            // Kingside castling
            if (nowyX > wspX)
            {
                Wieza rook = (Wieza) szachownica.pola[7][wspY].figura;
                szachownica.pola[7][wspY].figura = null;
                szachownica.pola[5][wspY].figura = rook;
                rook.wspX = 5;
                rook.setMoved(true);
            }
            // Queenside castling
            else
            {
                Wieza rook = (Wieza) szachownica.pola[0][wspY].figura;
                szachownica.pola[0][wspY].figura = null;
                szachownica.pola[3][wspY].figura = rook;
                rook.wspX = 3;
                rook.setMoved(true);
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