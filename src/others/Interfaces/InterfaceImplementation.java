package others.Interfaces;

public class InterfaceImplementation implements Interfejs, SecondInterfejs {

    //using interface decalred variables
    public int getInt() {
        return k;
    }

    //Overridden default implementation method
    @Override
    public String def(){
        return "overridden method";
    }

    //As long as there is no default implementation in any of clashing interfaces (both interfaces declare same signature method) there won't be a conflict between them.
    @Override
    public String hello(){
        return "hello!";
    }

    String method() {
        return Interfejs.fun();
    }

    /* //Cannot modify interface declared variables- by default they are static and final
    void modifyInt() {
        k+=5;
    }
    void modifyString(){
        str = new String("asdf");
    }*/
}
