package student_elina_kucenko.lesson4.task6;

class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.test1();
        stockTest.test2();
        stockTest.test3();
        stockTest.test4();
        stockTest.test5();
    }

    private void test1() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("apple", 999);

        int actualMaxPrice = stock
                .getMaxPrice();

        if (expectedMaxPrice == actualMaxPrice) {
            System.out.println("Test 1 - OK");
        } else {
            System.out.println("Test 1 - NOT OK");
        }
    }

    private void test2() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("apple", 999);
        stock.updatePrice(1);
        int actualMaxPrice = stock.getMaxPrice();

        if (expectedMaxPrice == actualMaxPrice) {
            System.out.println("Test 2 - OK");
        } else {
            System.out.println("Test 2 - NOT OK");
        }
    }

    private void test3() {
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("apple", 999);

        stock.updatePrice(2);
        stock.updatePrice(1000);
        int actualMaxPrice = stock.getMaxPrice();
        if (expectedMaxPrice == actualMaxPrice) {
            System.out.println("Test 3 - OK");
        } else {
            System.out.println("Test 3 - NOT OK");
        }
    }

    private void test4() {
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("apple", 999);

        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int actualMaxPrice = stock.getMaxPrice();

        if (expectedMaxPrice == actualMaxPrice) {
            System.out.println("Test 4 - OK");
        } else {
            System.out.println("Test 4 - NOT OK");
        }
    }

    private void test5() {
        int expectedMaxPrice = 27;
        Stock stock = new Stock("apple", 9);
        stock.updatePrice(27);
        int actualMaxPrice = stock.getMaxPrice();

        if (expectedMaxPrice == actualMaxPrice) {
            System.out.println("Test 5 - OK");
        } else {
            System.out.println("Test 5 - NOT OK");
        }
    }
}
