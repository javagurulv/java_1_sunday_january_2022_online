package student_devids_kropacovs.lesson4.level_3;

import java.util.Scanner;

class Task_8_9_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int x = s.nextInt();
        System.out.print("Enter 2nd number: ");
        int y = s.nextInt();
        System.out.print("Enter 3rd number: ");
        int z = s.nextInt();

        if (x == y && x == z) {
            System.out.println("All numbers are the same");
        } else if (x != y && x != z & y != z) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        System.out.println("");

        if (x < y && y < z || x <= y && y < z || x < y && y <= z) {
            System.out.println("Increasing order");
        } else if (x > y && y > z || x >= y && y > z || x > y && y >= z) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

        System.out.println("");

        // x > y && x > z
        // y > x && y > z
        // z > x && z > y
        // x < y && x < z
        // y < x && y < z
        // z < x && z < y
        // x == y && x > z
        // x == z && x > y
        // z == y && z > x
        // x == y && x < z
        // x == z && x < y
        // z == y && z < x
        // z == x && z == y

        if (x > y && x > z) {
            System.out.println(x + " is the highest number");
        } else if (y > x && y > z) {
            System.out.println(y + " is the higher number");
        } else if (z > x && z > y) {
            System.out.println(z + " is the highest number");
        } else if (x == y && x > z) {
            System.out.println(x + " is the highest number");
        } else if (x == z && x > y) {
            System.out.println(x + " is the highest number");
        } else if (z == y && z > x) {
            System.out.println(z + " is the highest number");
        }
        if (x == y && x < z) {
            System.out.println(x + " is the lowest number");
        } else if (x == z && x < y) {
            System.out.println(x + " is the lowest number");
        } else if (z == y && z < x) {
            System.out.println(z + " is the lowest number");
        } else if (x < y && x < z) {
            System.out.println(x + " is the lowest number");
        } else if (y < x && y < z) {
            System.out.println(y + " is the lowest number");
        } else if (z < x && z < y) {
            System.out.println(z + " is the lowest number");
        } else {
            System.out.println("all number are the same");
        }

    }
}