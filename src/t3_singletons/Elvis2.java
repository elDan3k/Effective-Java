package t3_singletons;

public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();
    public static Elvis2 getInstance() {
        return INSTANCE;
    }

    private Elvis2(){}

    public void leaveTheBuilding() {
        System.out.println("Elvis2 has left the building");

    }
}
