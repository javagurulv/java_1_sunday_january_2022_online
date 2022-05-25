package student_sergei_klunkov.lesson_4.level_6;

class StockTest {

    Stock stock = new Stock("Microsoft", 10);

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.maxValueTest();


    }

    public void maxValueTest() {

        int expectedPrice = 999;
        int actualPrice = stock.currentPrice;

        if (expectedPrice > stock.currentPrice){
            System.out.println("Test OK!");
        } else {
            System.out.println("Test FAILED!");
        }

    }

}
