package creational.singleton.mulitthreaded;

public class Client {
    public static void main(String[] args) {
        AirCraftOne airCraftOne = AirCraftOne.getInstance();
        airCraftOne.flying();
    }
}
