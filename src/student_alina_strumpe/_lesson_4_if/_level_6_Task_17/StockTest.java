package student_alina_strumpe._lesson_4_if._level_6_Task_17;

class StockTest {

    public static void main(String[] args) {


        Stock stock = new Stock("*10101*", 15.00, 10.00, 11.00);
        double newValue = stock.upDatePrice(20.00);
        System.out.println(newValue);
        stock.getPriceInformation();

        StockTest stockTest = new StockTest();
        stockTest.Test1NewValue();

    }

    public void Test1NewValue() {

        Stock stock = new Stock("KKKK", 5.00, 1.00, 6.00);
        //   double maxValue = 10.00;
        double expectedResult = 10.00;
        double actualResult = stock.upDatePrice(10.00);
        if (expectedResult == actualResult) {
            System.out.println("Test 1 is OK");
        } else {
            System.out.println("Test 1 is FAIL");
        }


    }


}
