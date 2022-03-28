package student_alina_strumpe._lesson_4_if._level_6_Task_17;

import java.util.Date;

public class StockTest {

    public static void main(String[] args) {

        Date date = new Date();

        StockTest stockTest = new StockTest();
        stockTest.stockCurrentValueTest();
        stockTest.stockMinValueTest();
        stockTest.stockMaxValueTest();
        stockTest.stockUpdateInfoOfValueTest();
    }

    public void stockCurrentValueTest() {
        Stock stock = new Stock("Test C ", 10.00, 15.00, 20.00);
        double currentValue = 20.00;
        if (currentValue == stock.getCurrentValue(20.00)) {
            System.out.println("Test Get Current value is OK");
        } else {
            System.out.println("Test Get Current value is FAIL");
        }
    }

    public void stockMinValueTest() {
        Stock stock = new Stock(" Min", 10.00, 40.00, 55.00);
        double minValue = 19.99;
        if (minValue == stock.getMinValue(19.99)) {
            System.out.println("Test Get Stock Min value is OK");
        } else {
            System.out.println("Test Get Stock Min value is FAIL");
        }
    }

    public void stockMaxValueTest() {
        Stock stock = new Stock(" MAX", 10.01, 10.00, 10.05);
        double maxValue = 50.00;
        if (maxValue == stock.getMaxValue(50.00)) {
            System.out.println("Test Get Stock MAX value is OK");
        } else {
            System.out.println("Test Get Stock MAX value is FAIL");
        }
    }

    public void stockUpdateInfoOfValueTest() {
        Stock stock = new Stock("Update", 12.00, 16.00, 19.00);
        String stockInformation = stock.printValueInformation();
        System.out.println(stockInformation);
        stock.upDateCurrentValue(10.00);
        stock.upDateMinValue(9.00);
        stock.upDateMaxValue(9.50);
        stockInformation = stock.printValueInformation();
        System.out.println(stockInformation);
       }
    }





