package student_alina_strumpe._lesson_4_if._level_1_Task_8;

class ThreeNumbersAndPrints {
    public int firstNumber;
    public int secondNumber;
    public int thirdNumber;
    public String text = "Process finished.";

    public ThreeNumbersAndPrints(){}



    public String acceptThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber == secondNumber && secondNumber == thirdNumber ){
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber){
            System.out.println("All numbers are different");
        }   else {  System.out.println("Neither all are equal or different");
                }
        return text;
            }
        }





// "All numbers are equal" if all three numbers are equal,
//         - "All numbers are different" if all three numbers are different
//         - "Neither all are equal or different" otherwise.