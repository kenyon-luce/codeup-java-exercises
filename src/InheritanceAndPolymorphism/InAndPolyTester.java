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

        System.out.println();
        Vehicle fasterBus = spawnVehicle("bus", 120);
        fasterBus.start();
    }

    public static Vehicle spawnVehicle(String vehicleType, int maxSpeed){
        Vehicle vehicle = null;

        switch (vehicleType) {
            case "vehicle":
                vehicle = new Vehicle(maxSpeed);
                break;
            case "bus":
                vehicle = new Bus(maxSpeed);
                break;
            case "jet":
                vehicle = new Jet(maxSpeed);
            break;
        }
        return vehicle;
    }
}
