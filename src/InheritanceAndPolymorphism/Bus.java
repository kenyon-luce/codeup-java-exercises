package InheritanceAndPolymorphism;

public class Bus extends Vehicle{
    private boolean headLightOn;

    public Bus(int maxSpeed){
        super(maxSpeed);
        this.headLightOn = false;
    }

    public void start(){
        System.out.println("... cranking bus engine");
    }

    public void honkHorn(){
        System.out.println("Honk!!");
    }

    public boolean isHeadLightOn() {
        return headLightOn;
    }

    public void setHeadLightOn(boolean headLightOn){
        this.headLightOn = headLightOn;
    }
}
