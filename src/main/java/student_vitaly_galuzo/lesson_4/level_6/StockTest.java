package student_vitaly_galuzo.lesson_4.level_6;

public class StockTest {
    Stock stock = new Stock("ASrock",10);
    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.maxValueTest();




    }

    public void maxValueTest() {

      int expectedMax = 999;
      int actualResult = stock.currentPrice;
      if (expectedMax > stock.currentPrice) {
          System.out.println("TEST is OK!");
      } else {
          System.out.println("TEST FAILED!");
      }
      }
















    }















