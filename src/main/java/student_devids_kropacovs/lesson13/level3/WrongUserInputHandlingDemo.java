package student_devids_kropacovs.lesson13.level3;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            System.out.println("Please, enter an interger");
            int x = sc.nextInt();
            if (sc.hasNextInt()) {
                System.out.println(sc.nextInt() + " is valid Integer");
                break;
            } else {
                System.out.println(sc.nextInt() + " is valid Integer");
            }
        }


    }
}
