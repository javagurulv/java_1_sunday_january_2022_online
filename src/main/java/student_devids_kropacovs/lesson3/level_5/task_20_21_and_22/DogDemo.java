package student_devids_kropacovs.lesson3.level_5.task_20_21_and_22;

import java.util.Scanner;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName();
        dog.getAge();
        dog.getColor();
        dog.voiceNameAndAge();
        dog.happyBirthday();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is a new color of a dog? ");
        String newcolor = scanner.nextLine();
        dog.changeColor(newcolor);
        dog.voiceNameAndAge();

    }
}
