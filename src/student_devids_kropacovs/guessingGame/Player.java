package student_devids_kropacovs.guessingGame;

import java.util.Scanner;

class Player {
    int number = 0;

    public void guess(){
        System.out.print("Please, write your guess: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("I am guessing a number: " + number);
    }

    public int number() {
        return number;
    }
}
