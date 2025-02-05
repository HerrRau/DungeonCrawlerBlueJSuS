public class TESTLOESUNG1
{
    public TESTLOESUNG1()
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
