package t3_singletons;

//WHY THIS WORKS:
//
public enum Elvis3 {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Elvis3 has left the building");
    }
}
