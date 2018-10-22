package others.Interfaces;

public interface Interfejs {

    int k = 10;
    String str = "cooo?";
    static String fun(){
        return "static string";
    }

    default String def() {
        return "default";
    }

    /* //only default methods can have body
    String notDef() {
        return "not default";
    }*/

    /* //An interface can only have public methods
    private String hello();*/

    String hello();
}
