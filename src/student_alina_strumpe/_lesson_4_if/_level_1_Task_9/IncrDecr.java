package student_alina_strumpe._lesson_4_if._level_1_Task_9;

 class IncrDecr {

    public int number1;
    public int number2;
    public int number3;
     public String text = "Finished";



    public String compareNumbers(int number1, int number2, int number3){
        if ((number1 < number2) && (number1 < number3)) {
            System.out.println("Increasing");
        } else if ((number1 > number2) && (number1 > number3)) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
        return text;
    }


}

//     Write a program that accepts three numbers from the user and prints:
//        - "increasing" if the numbers are in increasing order,
//        - "decreasing" if the numbers are in decreasing order,
//        - "Neither increasing or decreasing order" otherwise.