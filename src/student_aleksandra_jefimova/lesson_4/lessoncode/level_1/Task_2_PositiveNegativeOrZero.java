package student_aleksandra_jefimova.lesson_4.lessoncode.level_1;

import java.util.Scanner;

class Task_2_PositiveNegativeOrZero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Number is positive");
        }
        else if (number < 0) {
            System.out.println("Number is negative");
        }
        else if (number==0){
                System.out.println("Number is null");
            }
        }
    }
