package student_sergei_klunkov.lesson_3.homework.level_7.task_29;

import student_sergei_klunkov.lesson_3.homework.level_7.task_29.Computer;

class ComputerDemo {

    public static void main(String[] args) {
        Computer samsung = new Computer("Samsung",false );
        Computer lenovo = new Computer("Lenovo", false);

        samsung.command();
        lenovo.command();

        samsung.turnComputerOn();
        lenovo.turnComputerOn();
        System.out.println(" Samsung  computer is On = " + samsung.isComputerOn());
        System.out.println(" Lenovo computer is On = " + lenovo.isComputerOn());

        samsung.turnComputerOff();
        lenovo.turnComputerOff();
        System.out.println(" Samsung computer is Off = " + samsung.isComputerOn());
        System.out.println(" Lenovo computer is Off = " + lenovo.isComputerOn());

    }

}
