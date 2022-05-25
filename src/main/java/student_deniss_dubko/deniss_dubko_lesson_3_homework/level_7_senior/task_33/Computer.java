package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_7_senior.task_33;

class Computer {

    /*
    Дописать код программы, что бы она запускалась
    и выводила на консоль производителя и модель компьютера.
    Менять можно только класс Computer.
     */

    String manufacturer;
    String model;

    Computer(String manufacturer,
             String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
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
