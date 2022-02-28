package student_alina_strumpe._Lesson_2_level_2_intern_Task_5;

public class Main {
    public static void main(String[] args){

        BankAccount bAccount1 = new BankAccount();
        double[] bankAc1 = new double [] {17.00,18.12,56.15,32.47,101.01,1.00};
        double maxVal = bankAc1[0];        // dla vse elementov massiva (pol i otr)
        double minVal = bankAc1[0];

        for (int i=0; i < bankAc1.length; i++){
            if (maxVal < bankAc1[i]) {
                maxVal = bankAc1[i];
            }
            {
                if (minVal > bankAc1[i]){
                    minVal = bankAc1[i];
                }
            }
        }
        System.out.println("Max: " + maxVal);
        System.out.println("Min: " + minVal);



    }
}
