package student_sergei_klunkov.lesson_4.level_1;

import java.util.Scanner;


class EvenAndOddNumbers {


    boolean dividesByTwo(int number){
return (number%2==0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number");

        int number = scanner.nextInt();


        if (number%2!=0){
            System.out.println("Number is odd!");
        } else { if(number%2 == 0){
            System.out.println("Number is even!");
        }
    }

}

}
