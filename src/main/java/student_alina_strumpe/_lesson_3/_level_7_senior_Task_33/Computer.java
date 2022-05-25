package student_alina_strumpe._lesson_3._level_7_senior_Task_33;

class Computer {

    public String manufacture;
    public String model;

    public Computer(String manufacture, String model){
        this.manufacture = manufacture;
        this.model = model;
    }
    public String getManufacture() { return manufacture ;}
    public String getModel(){ return model ;}

}
 class ComputerDemo {

    public static void main(String[] args){

        Computer dell = new Computer("DELL","XXX-1");
        String manufacture = dell.getManufacture();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = "+ manufacture);
        System.out.println("Computer model = "+model);

    }
 }