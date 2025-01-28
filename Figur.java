import crawlergame.*;

public class Figur extends ModelSender 
{
    private Waffe waffe;
    private int staerke;

    public Figur() {
        staerke = 10;
    }

    public Figur(int i) {
        staerke = i;
    }

    public void setzeStaerke(int i) {
        staerke =i;
    }

    public int gibStaerke()  {
        return staerke;
    }

    public void setzeWaffe(Waffe w) {
        waffe = w;
        gibAnsicht().zeigeFigur(3, "sword.png");
    }

    public Waffe gibWaffe() {
        return waffe;
    }

}
