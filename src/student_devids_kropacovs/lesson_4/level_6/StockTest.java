package student_devids_kropacovs.lesson_4.level_6;

public class StockTest {
    public static void main(String[] args) {
        StockTest stocktest = new StockTest();
        stocktest.minPriceCheck();
        stocktest.maxPriceCheck();
        stocktest.currentPriceCheck();
    }

    public void maxPriceCheck(){
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        if(stock.maxStockPrice == 99){
            System.out.println("Max Price test pass!");
        }else{
            System.out.println("Max price test failed");
        }

    }

    public void minPriceCheck(){
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        if(stock.minStockPrice == 5){
            System.out.println("Min Price test pass!");
        }else{
            System.out.println("Min price test failed");
        }

    }

    public void currentPriceCheck(){
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        if(stock.stockPrice == 77){
            System.out.println("Real stock Price test pass!");
        }else{
            System.out.println("Real stock Price test failed");
        }

    }



}
