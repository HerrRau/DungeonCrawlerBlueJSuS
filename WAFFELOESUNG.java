public class WAFFELOESUNG extends Gegenstand
{
    private int angriff;    

    public WAFFELOESUNG()
    {
        angriff = 5;
        setzeBildname("sword.png");
    }

    public void setzeAngriff(int i) {
        angriff =i;
    }

    public int gibAngriff()  {
        return angriff;
    }

    public char gibKuerzel() {
        return 'w';
    }
}
