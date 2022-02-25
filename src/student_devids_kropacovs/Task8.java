package student_devids_kropacovs;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Please, write your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello! Mr/Ms " + name);
    }
}
