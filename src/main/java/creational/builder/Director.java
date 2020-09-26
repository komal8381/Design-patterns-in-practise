package creational.builder;

/**this class can be skipped sometimes and can be accomondated in client code*/
public class Director {
    AircraftBuilder builder;
    public Director(AircraftBuilder builder){
        this.builder = builder;
    }
    public void constructAircarft(Boolean isPassengerPlane){
        builder.buildEngine();
        builder.buildCockpit();
        builder.buildWings();
        if(isPassengerPlane)
            builder.buildBathrooms();
    }
}
