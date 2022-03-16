package student_sergei_klunkov.lesson_4.lessoncode;

class Car {

    String brand;
    String color;
    int currentSpeed; //default int = 0;
    boolean isEngineOn; //default boolean = false;

    public Car(String brand, String color){
        this.brand = brand;
        this.color = color;
        this.currentSpeed = 0;
        this.isEngineOn = false;

    }
    public void engineOnOff(){
        isEngineOn = !isEngineOn;


    }

    public void accelerate(){
        if(isEngineOn){
        currentSpeed = currentSpeed + 1; // currentSpeed = currentSpeed + 1;
        } else {
            System.out.println("Engine is off");
        }



}
public void decelerate(){
        if (currentSpeed > 0 && isEngineOn){
            currentSpeed--; //currentSpeed = currentSpeed - 1;
        }
        else {
            System.out.println("Current speed is already 0 OR Engine is off ");
        }
}
public void printInfo() {
    System.out.println("Brand: " + brand);
    System.out.println("Color: " + color);
    System.out.println("Current Speed " + currentSpeed);
    System.out.println("Engine On: " + isEngineOn);
    System.out.println();
}


}