import crawlergame.*;

public class Figur extends ModelSender 
{
    private Waffe waffe;

    public Figur() {
    }

    public void setzeWaffe(Waffe w) {
        waffe = w;
        gibAnsicht().zeigeFigur(3, "sword.png");
    }

    public Waffe gibWaffe() {
        return waffe;
    }

}
