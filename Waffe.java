public class Waffe extends Gegenstand
{
    int angriff;    

    public Waffe()
    {
        angriff = 5;
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
