package creational.singleton.singleThreader;

public class Client {
    public static void main(String[] args) {
        AirCraftOne airCraftOne = AirCraftOne.getInstance();
        airCraftOne.flying();
    }
}
