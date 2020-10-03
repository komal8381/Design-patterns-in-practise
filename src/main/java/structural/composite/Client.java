package structural.composite;

public class Client {
 
    public void main() {
 
        Airforce NatoAllaiance = new Airforce();
        
        // The nested methods aren't listed for brevity's sake
        NatoAllaiance.add(createCanadaAirForce());
        NatoAllaiance.add(createUSAAirForce());
 
        F16 frenchF16 = new F16();
        C10 germanCargo = new C10();
 
        NatoAllaiance.add(frenchF16);
        NatoAllaiance.add(germanCargo);
 
        System.out.println(NatoAllaiance.getPersonnel());
    }
}
