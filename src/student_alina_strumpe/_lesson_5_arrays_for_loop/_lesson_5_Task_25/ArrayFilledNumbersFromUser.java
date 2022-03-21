package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_25;

import java.util.Scanner;

public class ArrayFilledNumbersFromUser {

/*    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert array length: ");
        int arrayLength = scan.nextInt();
        int[] mas1 = new int[arrayLength]; // !!!
        for(int i=0; i< mas1.length;i++) {
            System.out.println("Insert numbers: "+(i+1));
            int userNumbers = scan.nextInt();  // mas[i] = scanner.nextInt(); -
            mas1[i] = userNumbers;
        }
           System.out.println(Arrays.toString(mas1));
        }
        }
*/
      public int getArrayLengthFromUser() {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Insert array length: ");
          return scanner.nextInt();
      }

      public int[] newArray(int arrayLength){ return new int [arrayLength];}

      public void fillArray(int[] newArray) {
          Scanner scanner = new Scanner(System.in);
          for (int i = 0; i < newArray.length; i++) {
              System.out.println("Insert number: " + (i + 1));
              newArray[i] = scanner.nextInt();
          }
      }

      public void printArray(int[] array){
            System.out.print("Array: [");
            for(int element : array){
                System.out.print(element+" ");
            }
            System.out.println("]"+"\n");
          }
}