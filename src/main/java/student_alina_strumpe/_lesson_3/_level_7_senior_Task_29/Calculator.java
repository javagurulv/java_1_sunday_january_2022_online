package student_alina_strumpe._lesson_3._level_7_senior_Task_29;

import java.math.RoundingMode;

class Calculator {

    private double brMonthIncome;
        private double ntMonthIncome;
     private double taxMonthIncome1;
    private double taxMonthIncome2;
    private double monthTax3;

//    public Calculator(double monthTax3){
//        this.monthTax3 = monthTax3;



    public Calculator(double brMonthIncome){
        this.brMonthIncome = brMonthIncome;


            }

//    public double setCalculator2(double monthTax3){ return monthTax3; }
//    public double getMonthTax3(){ return monthTax3; }
//    public double calculateTax3(){ return monthTax3 = brMonthIncome / 100 * 24.09;}


    public double getMonthIncome(){ return this.brMonthIncome ;}


    public double calculateTax1(){ return (taxMonthIncome1 = (brMonthIncome / (double) 100 * 10.5 )) ; }

    public double calculateTax2(){ return (taxMonthIncome2 = (brMonthIncome - taxMonthIncome1- 250) / 100 * 20);}
    public double calculateNtMonthIncome(){ return ntMonthIncome = brMonthIncome - taxMonthIncome2 - taxMonthIncome2 ;}

//    public double setCalculator2(double monthTax3){ return monthTax3; }
//    public double getMonthTax3(){ return monthTax3; }
//    public double calculateTax3(){ return monthTax3 = brMonthIncome / 100 * 24.09;}
}



