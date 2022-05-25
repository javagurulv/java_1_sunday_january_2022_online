package student_yevgeniy_tolks.lesson_3.level_7;
//Task33 - add lines of code to run application

 class Computer {
     String manufacturer;
     String model;

     Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
     }
//added code with getManufacturer() method
        public String getManufacturer() {
        return manufacturer;
     }
 //added code with getModel() method
        public String getModel() {
        return model;
     }
 }

class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }
}
