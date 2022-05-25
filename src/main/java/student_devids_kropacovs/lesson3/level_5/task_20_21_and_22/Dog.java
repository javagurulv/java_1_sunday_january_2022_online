package student_devids_kropacovs.lesson3.level_5.task_20_21_and_22;

import java.util.Scanner;

class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the dog name? ");
        this.dogName = scanner.next();
        return this.dogName;
    }

    int getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is dog's age? ");
        this.dogAge = scanner.nextInt();
        return this.dogAge;
    }

    String getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is a dog color? ");
        this.dogColor = scanner.nextLine();
        return dogColor;
    }

    public void voiceNameAndAge() {
        System.out.println("Dog name is " + dogName + ", age is " + dogAge + " and color is " + dogColor);
    }

    public void happyBirthday() {
        System.out.println("Happy Birthday! ");
        this.dogAge = this.dogAge + 1;
    }

    public void changeColor(String newcolor) {
        this.dogColor = newcolor;
    }
}
