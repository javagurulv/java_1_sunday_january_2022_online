package student_devids_kropacovs.arrayTraining1;

import java.util.Scanner;

class ArrayOfData {
    String[] names;
    int[] ages;
    int[] heights;
    int arraySize;
    int x = 0;

    public void amount_of_ppl() {
        System.out.print("Please, enter how many people would you like to write down? ");
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        names = new String[arraySize];
        ages = new int[arraySize];
        heights = new int[arraySize];

        while (x < arraySize) {
            String name;
            int age;
            int height;
            System.out.println("Please, write the information of the person No. " + (x+1));
            Scanner scannerForName = new Scanner(System.in);
            Scanner scannerForAge = new Scanner(System.in);
            Scanner scannerForHeight = new Scanner(System.in);
            name = scannerForName.next();
            names[x] = name;
            age = scannerForAge.nextInt();
            ages[x] = age;
            height = scannerForHeight.nextInt();
            heights[x] = height;
            x = x + 1;
        }

    }
    public void print_out_info(){
        System.out.println("Would you like to print out the names? Press 1 if you want to press any other button to teminate the programm");
        int num;
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num == 1){
            while(x < arraySize){
                System.out.println(names[x] + " " + ages[x] + " " + heights[x]);
                x = x+1;
            }
        }else{
            System.out.println("Bye");
        }
    }

        public int number(){
            return arraySize;
        }



}