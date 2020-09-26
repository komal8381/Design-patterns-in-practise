package creational.singleton.singleThreader;

public class AirCraftOne {
    private static AirCraftOne instance;

    private AirCraftOne() {
        instance = null;
    }

    public static AirCraftOne getInstance() {
        if (instance == null) {
            instance = new AirCraftOne();
        }
        return instance;
    }
    public void flying(){
        System.out.println("AirCraft One is flying....!!!");
    }
}
