package InheritanceAndPolymorphism;

public class InAndPolyTester {
    public static void main(String[] args){
        Vehicle genericVehicle = new Vehicle();
        genericVehicle.start();

        Bus bus = new Bus(80);
        bus.setHeadLightOn(true);
        bus.setHeadLightOn(true);
        bus.start();
        bus.honkHorn();
        bus.setNumberOfOccupants(2);
        System.out.println("Zooming in a bus " + /* bus.getMaxSpeed() + " MPH */"with " + bus.getNumberOfOccupants() + " occupants inside.");

        Jet fastJet = new Jet(2000);
        fastJet.setNumberOfOccupants(1);
        fastJet.start();
        System.out.println("Zooming in a fast jet at " + /* fastJet.getMaxSpeed() + " MPH */"with " + fastJet.getNumberOfOccupants() + " occupants inside.");
    }
}
