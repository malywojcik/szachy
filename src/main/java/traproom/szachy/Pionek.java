package traproom.szachy;

import java.util.ArrayList;
import java.util.List;

public class Pionek extends Figury
{
    public Pionek(int x, int y, Szachownica szachownica, boolean bialy)
    {
        super(x, y, szachownica, bialy);
    }

    @Override
    public List<Ruch> mozliwe_pozycje(Szachownica szachownica)
    {
        List<Ruch> mozliweRuchy = new ArrayList<>();

        int kierunek = bialy ? -1 : 1;
        int nextY = wspY + kierunek;


        if(szachownica.wZakresie(wspX, nextY) && !szachownica.pola[wspX][nextY].zajete())
        {
            mozliweRuchy.add(new Ruch(wspX, wspY, wspX, nextY));

            //jesli pionek jest na swoim poczatku, moze ruszyc sie o 2 pola
            if((bialy && wspY == 6) || (!bialy && wspY == 1))
            {
                int doubleY = wspY + 2 * kierunek;
                if(!szachownica.pola[wspX][doubleY].zajete())
                    mozliweRuchy.add(new Ruch(wspX, wspY, wspX, doubleY));
            }
        }

        //bicie po skos
        for(int dx : new int[]{-1, 1})
        {
            int nextX = wspX + dx;
            if(szachownica.wZakresie(nextX, nextY))
            {
                Pole pole = szachownica.pola[nextX][nextY];
                if(pole.zajetePrzezWroga(bialy))
                    mozliweRuchy.add(new Ruch(wspX, wspY, nextX, nextY));
            }
        }

        return mozliweRuchy;
    }

    @Override
    public void ruch(int nowyX, int nowyY)
    {
        szachownica.pola[wspX][wspY].figura = null;
        this.wspX = nowyX;
        this.wspY = nowyY;
        szachownica.pola[nowyX][nowyY].figura = this;
    }
}
