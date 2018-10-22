package t3_singletons;

//Enum is a special kind of class- when compiling JVM creates number of objects depending on number of enum declared values.
//If there are any methods or variables declared they will be shared along all instances.
//If there is only 1 value/instance declared at compile time there is no way to add another during runtime.
public enum Elvis3 {
    INSTANCE;

    private int number = 3;

    public void leaveTheBuilding() {
        System.out.println("Elvis" + number + " has left the building");
    }
}
