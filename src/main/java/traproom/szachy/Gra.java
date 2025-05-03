package traproom.szachy;

public class Gra
{
    public Szachownica szachownica;
    public Gracz gracz1, gracz2;
    public Gracz aktualnyGracz;

    public Gra()
    {
        szachownica = new Szachownica();
        gracz1 = new Gracz(true);
        gracz2 = new Gracz(false);
        aktualnyGracz = gracz1;

        szachownica.pola[0][0].figura = new Wieza(0, 0, szachownica, false);
        szachownica.pola[1][0].figura = new Skoczek(1, 0, szachownica, false);
        szachownica.pola[2][0].figura = new Goniec(2, 0, szachownica, false);
        szachownica.pola[3][0].figura = new Hetman(3, 0, szachownica, false);
        szachownica.pola[4][0].figura = new Krol(4, 0, szachownica, false);
        szachownica.pola[5][0].figura = new Goniec(5, 0, szachownica, false);
        szachownica.pola[6][0].figura = new Skoczek(6, 0, szachownica, false);
        szachownica.pola[7][0].figura = new Wieza(7, 0, szachownica, false);

        for (int i = 0; i < 8; i++)
            szachownica.pola[i][1].figura = new Pionek(i, 1, szachownica, false);

        szachownica.pola[0][7].figura = new Wieza(0, 7, szachownica, true);
        szachownica.pola[1][7].figura = new Skoczek(1, 7, szachownica, true);
        szachownica.pola[2][7].figura = new Goniec(2, 7, szachownica, true);
        szachownica.pola[3][7].figura = new Hetman(3, 7, szachownica, true);
        szachownica.pola[4][7].figura = new Krol(4, 7, szachownica, true);
        szachownica.pola[5][7].figura = new Goniec(5, 7, szachownica, true);
        szachownica.pola[6][7].figura = new Skoczek(6, 7, szachownica, true);
        szachownica.pola[7][7].figura = new Wieza(7, 7, szachownica, true);

        for (int i = 0; i < 8; i++)
            szachownica.pola[i][6].figura = new Pionek(i, 6, szachownica, true);
    }

    public void zmienGracza()
    {
        if (aktualnyGracz == gracz1)
            aktualnyGracz = gracz2;
        else
            aktualnyGracz = gracz1;
    }
}

