package student_devids_kropacovs.lesson3.level_5.task18_19;

import java.util.Scanner;

 class Dog {
    String dogName;
    int dogAge;

    String getName (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the dog name? ");
        this.dogName = scanner.next();
        return this.dogName;
    }

    int getAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is dog's age? ");
        this.dogAge = scanner.nextInt();
        return this.dogAge;
    }

    public void voiceNameOnly(){
        System.out.println(dogName + ", " + dogName + ", " + dogName);
    }
    public void voiceNameAndAge(){
        System.out.println("Dog name is " + dogName + " and age is " + dogAge);
    }
}
