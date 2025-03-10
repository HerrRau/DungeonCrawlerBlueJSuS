import crawlergame.*;

public class FIGURLOESUNG1 extends ModelSender
{
    private Schild schild;
    private Waffe waffe;
    private int staerke;
    private int geschicklichkeit;

    public FIGURLOESUNG1() {
        staerke = 10;
    }

    public FIGURLOESUNG1(int staerkeNeu, int geschicklichkeitNeu, Waffe waffeNeu, Schild schildNeu) {
        staerke = staerkeNeu;
        geschicklichkeit = geschicklichkeitNeu;
        waffe = waffeNeu;
        schild = schildNeu;        
    }

    public FIGURLOESUNG1(int staerkeNeu, int geschicklichkeitNeu) {
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
        gibAnsicht().zeigeFigur(3, w.gibBildname());
    }

    public Waffe gibWaffe() {
        return waffe;
    }

    public void setzeSchild(Schild s) {
        schild = s;
        gibAnsicht().zeigeFigur(4, s.gibBildname());
    }

    public Schild gibSchild() {
        return schild;
    }

}
