package student_stanislav_astafjev.lesson_4.Task_17;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.maxStockPrice();
    }
   public void maxStockPrice() {
        Stock stock = new Stock("Google",12);
        int maxPrice = stock.updatePrice(999);
        if (maxPrice > stock.currentPrice) {
            System.out.println("TEST PASS");
        }
        else {
            System.out.println("TEST FAIL");
        }
   }
}

