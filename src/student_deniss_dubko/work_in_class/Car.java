package student_deniss_dubko.work_in_class;

public class Car {

    private String brand;
    private String colour;

    public Car(String carBrand, String carColour) {
        this.brand = carBrand;
        this.colour = carColour;
    }

    public void setBrand() {
        System.out.println("Brand: " + this.brand);
    }

    public void setColour() {
        System.out.println("Colour: " + this.colour);
    }


}
