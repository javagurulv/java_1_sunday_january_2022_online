package student_stanislav_astafjev.lesson_3.Task_33;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer dell = new Computer("Dell","xxx-1");
        String manufacturer = dell.manufacturer;
        String model = dell.model;
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }
}