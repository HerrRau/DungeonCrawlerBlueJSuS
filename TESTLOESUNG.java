public class TESTLOESUNG
{
    public TESTLOESUNG()
    {
        test();
    }
    
    public void test() {
        Figur f = new Figur();
        Schild s = new Schild();
        Waffe w = new Waffe();
        f.setzeWaffe(w);
        f.setzeSchild(s);
    }

}
