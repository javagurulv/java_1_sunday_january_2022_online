package student_alina_strumpe._lesson_4_if._level_6_Task_17;

import java.util.Date;

class StockDEmo {



     public static void main(String[] args){



         Stock stock = new Stock("*10101*", 15.00,10.00,20.00);
         double result = stock.upDatePrice(5);
         stock.getPriceInformation();
//         System.out.println(result);
//         System.out.println("New max value: "+ stock.maxValue);
//         System.out.println("New min value: "+stock.minValue);

     }
}
