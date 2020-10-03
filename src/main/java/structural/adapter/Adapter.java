package structural.adapter;

public class Adapter implements IAircraft{
    private HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon hotAirBalloon){
        this.hotAirBalloon = hotAirBalloon;
    }

    public void fly() {
        String gas = hotAirBalloon.inflateWithGas();
        hotAirBalloon.fly(gas);
    }
}
