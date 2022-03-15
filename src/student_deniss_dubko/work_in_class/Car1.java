package student_deniss_dubko.work_in_class;

public class Car1 {

    String brand;
    String colour;
    int currentSpeed; // default int = 0
    boolean isEngineOn; // default boolean = false

    public Car1(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
        this.currentSpeed = 0;
        this.isEngineOn = false;
    }

    public void engineOnOff() {
        isEngineOn = !isEngineOn;
    }

    public void accelerate() {
        if (isEngineOn) {
            currentSpeed++; // currentSpeed = currentSpeed + 1
        }else {
            System.out.println("Engine is off");
        }
    }

    public void decelerate() {
        if (currentSpeed > 0 && isEngineOn) {
            currentSpeed--; // currentSpeed = currentspeed = 1
        } else {
            System.out.println("Current speed is already 0 OOR Engine is off");
        }
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Current Speed: " + currentSpeed);
        System.out.println("Engine On: " + isEngineOn);
        System.out.println();
    }


}
