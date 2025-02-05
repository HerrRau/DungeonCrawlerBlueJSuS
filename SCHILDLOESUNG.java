public class SCHILDLOESUNG extends Gegenstand
{
    private int verteidigung;    

    public SCHILDLOESUNG()
    {
        verteidigung = 5;
        setzeBildname("shield.png");
    }

    public void setzeVerteidigung(int i) {
        verteidigung=i;
    }

    public int gibVerteidigung()  {
        return verteidigung;
    }

    public char gibKuerzel() {
        return 's';
    }
}
