public class WAFFELOESUNG1 extends Gegenstand
{
    private int angriff;    

    public WAFFELOESUNG1()
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
