package creational.abstractFactory;

public interface IAircraftFactory {
 
    IEngine createEngine();
 
    IWings createWings();
 
    ICockpit createCockpit();
}
