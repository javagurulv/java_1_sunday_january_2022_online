package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayUserRandomNum {
/*
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int arrayLength = scan.nextInt();
        int[] userArray = new int[arrayLength];
        for(int i=0;i < userArray.length; i++){
         //   int userNumbers = random.nextInt(100);
         //   userArray[i] = userNumbers;
            userArray[i] = random.nextInt(100); // toze samoe, chto i verhnii dve stroki
        System.out.println("["+i+"]" +"="+ userArray[i]);
        }
        System.out.println(Arrays.toString(userArray));
    }
}
*/

       public int getArrayLengthFromUser(){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Insert array length: ");
           return scanner.nextInt();
       }
       public int[] createNewArray(int arrayLength){ return new int [arrayLength];}

        public void fillArrayWithRandomNumbers(int[] newArray){
           Random random = new Random();
           for(int i=0; i< newArray.length; i++){
               newArray[i] = random.nextInt(50);
           }
        }

        public void printArray(int[] newArray){
               System.out.print(Arrays.toString(newArray));}
           }

