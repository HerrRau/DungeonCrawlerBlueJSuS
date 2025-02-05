import crawlergame.*;

public class FIGURLOESUNG extends ModelSender
{
    private Schild schild;
    private Waffe waffe;
    private int staerke;
    private int geschicklichkeit;

    public FIGURLOESUNG() {
        staerke = 10;
    }

    public FIGURLOESUNG(int staerkeNeu, int geschicklichkeitNeu, Waffe waffeNeu, Schild schildNeu) {
        staerke = staerkeNeu;
        geschicklichkeit = geschicklichkeitNeu;
        waffe = waffeNeu;
        schild = schildNeu;        
    }

    public FIGURLOESUNG(int staerkeNeu, int geschicklichkeitNeu) {
        staerke = staerkeNeu;
        geschicklichkeit = geschicklichkeitNeu;
        waffe = null;
        schild = null;        
    }

    public int berechneAngriff() {
        if (waffe==null) {
            return staerke;
        }
        else {
            return staerke + waffe.gibAngriff();
        }        
    }

    public int berechneVerteidigung() {
        if (schild==null) {
            return geschicklichkeit;
        }
        else {
            return geschicklichkeit + schild.gibVerteidigung();
        }       
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

    public void setzeSchild(Schild s) {
        schild = s;
        gibAnsicht().zeigeFigur(4, "shield.png");
    }

    public Waffe gibWaffe() {
        return waffe;
    }

}
