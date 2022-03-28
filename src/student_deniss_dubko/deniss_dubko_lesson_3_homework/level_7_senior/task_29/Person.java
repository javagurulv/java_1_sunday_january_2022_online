package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_7_senior.task_29;

import java.util.Scanner;

class Person {

    String personName;
    int personAge;
    String personHairColor;

    public Person (String personName,
                   int personAge,
                   String personHairColor) {

        this.personName = personName;
        this.personAge = personAge;
        this.personHairColor = personHairColor;
    }

    public void sayYourName() {
        System.out.println("My name is: " + this.personName);
    }

    public void sayYourAge() {
        System.out.println("My age is: " + this.personAge);
    }

    public void sayHairColor() {
        System.out.println("My hair color is: " + this.personHairColor);
    }

    public void changeHairColor() {
        System.out.println("Want to change Your hair color? (Yes/No)" );
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        if (answer.equals("Yes")) {
            System.out.println("Which color You want?" );
            Scanner scanner = new Scanner(System.in);
            String newColor = scanner.nextLine();
            System.out.println("Ok, Your hair color now is " + newColor + "!");
        } else {
            System.out.println("Ok, Your hair color stay " + this.personHairColor + "!");
        }

        in.close();
    }


}
