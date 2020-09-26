package creational.singleton.mulitthreaded;

public class AirCraftOne {
    private volatile static AirCraftOne instance;

    private AirCraftOne() {
        instance = null;
    }

    public synchronized static AirCraftOne getInstance() {
        if (instance == null) {
            synchronized (AirCraftOne.class) {
                if (instance == null) {
                    instance = new AirCraftOne();
                }
            }
        }
        return instance;
    }

    public void flying() {
        System.out.println("AirCraft One is flying....!!!");
    }
}
