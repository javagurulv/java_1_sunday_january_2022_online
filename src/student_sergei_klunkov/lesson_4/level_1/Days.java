package student_sergei_klunkov.lesson_4.level_1;

import java.util.Scanner;
import java.util.SortedMap;

class Days {

    int monday;
    int tuesday;
    int wednesday;
    int thursday;
    int friday;
    int saturday;
    int sunday;
    int numberOfTheDay;

    public Days (){

        this.monday = 1;
        this.tuesday = 2;
        this.wednesday = 3;
        this.thursday = 4;
        this.friday = 5;
        this.saturday = 6;
        this.sunday = 7;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number from 1 to 7!");


        int numberOfTheDay = scanner.nextInt();


        if (numberOfTheDay == 1){
            System.out.println("Its Monday!");
        }
        if (numberOfTheDay == 2){
            System.out.println("Its Tuesday!");
        }
        if (numberOfTheDay == 3){
            System.out.println("Its Wednesday!");
        }
        if (numberOfTheDay == 4){
            System.out.println("Its Thursday!");
        }
        if (numberOfTheDay == 5){
            System.out.println("Its Friday!");
        }
        if (numberOfTheDay == 6){
            System.out.println("Its Saturday!");
        }
        if (numberOfTheDay == 7){
            System.out.println("Its Sunday!");
        }
    }



}
