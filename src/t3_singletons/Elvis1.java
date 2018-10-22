package t3_singletons;

//static final field - just 1 private constructor call at static field initialization, access by static final field call
public class Elvis1 {
    public static final Elvis1 INSTANCE = new Elvis1();

    private Elvis1() {}

    public void leaveTheBuilding() {
        System.out.println("Elvis1 has left the building");
    }

}
