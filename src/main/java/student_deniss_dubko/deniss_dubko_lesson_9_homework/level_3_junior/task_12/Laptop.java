package student_deniss_dubko.deniss_dubko_lesson_9_homework.level_3_junior.task_12;

abstract class Laptop {

    private String brand;
    private short ram;
    private int ssdMemory;

    public Laptop(String brand,
                  short ram,
                  int ssdMemory) {

        this.brand = brand;
        this.ram = ram;
        this.ssdMemory = ssdMemory;
    }

    abstract public int laptopPrice(int price);

}