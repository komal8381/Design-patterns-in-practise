package creational.builder;

public class Client {
    public void main() {
        AircraftBuilder builder = new BoeingAircarftBuilder();
        Director director = new Director(builder);
        director.constructAircarft(false);

        IAircraft aircraft = builder.getResult();
    }
}
