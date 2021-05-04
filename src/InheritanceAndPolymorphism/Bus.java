package InheritanceAndPolymorphism;

public class Bus extends Vehicle{
    private boolean headLightOn;

    public Bus(int maxSpeed){
        super(maxSpeed);
        this.headLightOn = false;
    }
}
