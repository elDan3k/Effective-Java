package t3_singletons;

public class Main {
    public static void main(String[] args) {
        Elvis1.INSTANCE.leaveTheBuilding();
        Elvis2.getInstance().leaveTheBuilding();
        Elvis3.INSTANCE.leaveTheBuilding();
    }
}
