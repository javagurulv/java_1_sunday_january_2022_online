package student_sergei_klunkov.lesson_9.level_3.task_12;

class ComputerUser extends Computer {

    public ComputerUser(String nameOfComputer, int memoryOfSSD) {
        super(nameOfComputer, memoryOfSSD);
    }

    @Override
    boolean isComputerMacOrWindows() {
        return false;
    }
}
