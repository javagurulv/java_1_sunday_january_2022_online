package student_sergei_klunkov.lesson_9.level_3.task_12;

class ComputerAI extends Computer {

    public ComputerAI(String nameOfComputer, int memoryOfSSD) {
        super(nameOfComputer, memoryOfSSD);
    }

    @Override
    boolean isComputerMacOrWindows() {
        return false;
    }
}
