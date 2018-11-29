package others.Wrappers;

public class Test {

    public static void main(String[] args) {

        Klasa kl = new Klasa();
        System.out.println(kl.a + " " + kl.b + " " + kl.str);
        Test t = new Test();
        t.settuj(kl);
        System.out.println(kl.a + " " + kl.b + " " + kl.str);

    }

    void settuj(Klasa klasa) {
        klasa.a = 155;
        klasa.b = 5555;
        klasa.str = "cxzvxzv";
    }

    String exc() {
        throw new RuntimeException("ASDF");
        //return "abc";
    }
}
