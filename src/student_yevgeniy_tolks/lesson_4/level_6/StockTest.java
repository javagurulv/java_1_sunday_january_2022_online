package student_yevgeniy_tolks.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.maxStockPrice();
    }

    public void maxStockPrice() {

        Stock stock = new Stock("MaK Caterpillar", 12);

        int maxPrice = stock.updatePrice(999);
        if (maxPrice > stock.currentPrice) {
            System.out.println("Max price - Test OK!");
        } else {
            System.out.println("Max price - Test FAILED!");

        }
    }


}
