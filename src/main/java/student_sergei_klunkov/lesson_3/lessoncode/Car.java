package student_sergei_klunkov.lesson_3.lessoncode;

class Car {

    private String brand;
    private boolean radioOn;

    public Car(String brandName, boolean radioOn) {

        this.brand = brandName;
        this.radioOn = radioOn;

    }

    public void voice() {
        System.out.println("My brand is " + this.brand);

    }

    public void turnRadioOn() {

        this.radioOn = true;

    }

    public void turnRadioOff(){

        this.radioOn = false;

    }

    public boolean isRadioOn() {

        return this.radioOn;

    }







}
