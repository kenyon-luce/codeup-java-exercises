package InheritanceAndPolymorphism;

public class Vehicle {
    private int numberOfOccupants;
    private int maxSpeed;

    public Vehicle(){
        this.maxSpeed = 0;
        //if nothing is passed into Vehicle, the default "speed" will be 0
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed; //set speed
    }

    public void start(){
        System.out.println("Starting ...");
    }

    public int getNumberOfOccupants(){
        return this.numberOfOccupants; //default number
    }

    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants; //set number
    }

//    public void getMaxSpeed(){
//        return this.maxSpeed;
//    }
}
