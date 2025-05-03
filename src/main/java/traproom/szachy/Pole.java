package traproom.szachy;

public class Pole
{
    public Figury figura;

    public boolean zajete()
    {
        return figura != null;
    }

    public boolean zajetePrzezWroga(boolean bialy)
    {
        return zajete() && figura.bialy != bialy;
    }

    public boolean zajetePrzezSojusznika(boolean bialy)
    {
        return zajete() && figura.bialy == bialy;
    }
}
