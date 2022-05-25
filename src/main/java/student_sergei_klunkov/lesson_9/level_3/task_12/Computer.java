package student_sergei_klunkov.lesson_9.level_3.task_12;

abstract class Computer {

    private String nameOfComputer;
    private int memoryOfSSD;

    public Computer(String nameOfComputer, int memoryOfSSD) {
        this.memoryOfSSD = memoryOfSSD;
        this.nameOfComputer = nameOfComputer;
    }

    abstract boolean isComputerMacOrWindows();

}
