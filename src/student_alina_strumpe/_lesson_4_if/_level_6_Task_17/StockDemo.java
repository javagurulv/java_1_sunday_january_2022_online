package student_alina_strumpe._lesson_4_if._level_6_Task_17;


class StockDemo {

    public static void main(String[] args) {

        Stock stockTesla = new Stock("Tesla", 10.00, 15.00, 17.00);
        String stockInformation = stockTesla.printValueInformation();
        System.out.println("Stock Info 1 : " + stockInformation);

        String stockName = stockTesla.getCompanyName("Tesla");
        double stockTeslaCurrentValue = stockTesla.getCurrentValue(40.04);
        double stockTeslaMinValue = stockTesla.getMinValue(20.00);
        double stockTeslaMaxValue = stockTesla.getMaxValue(55.00);


        stockTesla.upDateCurrentValue(stockTeslaCurrentValue);
        stockTesla.upDateMinValue(stockTeslaMinValue);
        stockTesla.upDateMaxValue(stockTeslaMaxValue);


        stockInformation = stockTesla.printValueInformation();
        System.out.println("Stock Info 2 : " + stockInformation);

       /* StockTest stockTest = new StockTest();
        stockTest.Test1MaxValue();
*/
    }

   // public void Test1MaxValue() {

    //    Stock stock = new Stock("KKKK", 5.00, 3.00,4.00);
       /* stock.getMaxValue(44.00);
        stock.getCurrentValue(88.00);
        stock.getMinValue(33.00);
        double result = stock.getMaxValue();
*/

    }




