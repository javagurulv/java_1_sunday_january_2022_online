package student_sergei_klunkov.lesson_3.homework.level_7.task_29;

class Computer {

    private String brand;
    private boolean computerOn;

    public Computer(String brand, boolean computer){

        this.brand = brand;
        this.computerOn = computerOn;


    }

    public void command() {
        System.out.println("My brand is - " + this.brand);

    }

    public void turnComputerOn() {
        this.computerOn = true;
    }

    public void turnComputerOff() {
        this.computerOn = false;

    }

    public boolean isComputerOn() {
        return this.computerOn;

    }



}
