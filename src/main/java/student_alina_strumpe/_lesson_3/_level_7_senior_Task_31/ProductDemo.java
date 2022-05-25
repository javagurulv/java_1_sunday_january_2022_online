package student_alina_strumpe._lesson_3._level_7_senior_Task_31;

public class ProductDemo {

     public static void main(String[] args){

         Product product1 = new Product("Perfume", 220, 30);

         String printInformation = product1.prName +", "+ product1.regularPrice +", "+ product1.discount;


         double actualPrice = product1.calculateActPrice();

         System.out.println("Product category, "+ "price, "+"discount: "+ printInformation +"\n"+"Actual price: "+ actualPrice);

     }
}
