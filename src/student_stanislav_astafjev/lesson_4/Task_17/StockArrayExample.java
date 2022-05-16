package student_stanislav_astafjev.lesson_4.Task_17;

class StockArrayExample {
    public static void main(String[] args) {


        Stock[] stocks = new Stock[3];

        System.out.println(stocks[0]);
        System.out.println(stocks[1]);
        System.out.println(stocks[2]);


        //stocks[0] = null;
        //stocks[1] = null;
        //stocks[2] = null;

        //Stock stock = stocks[0];
        //stock.updatePrice(11);
        //java.lang.NullPointerException

        //null.updatePrice(11); java.lang.NullPointerException


        stocks[0] = new Stock("Google",1);
        stocks[1] = new Stock("Amazon",1);
        stocks[2] = new Stock("Ali",1);


        Stock googleStock = stocks[0];
        Stock amazonStock = stocks[1];
        Stock aliStock = stocks[2];


        googleStock.updatePrice(12);
        amazonStock.updatePrice(33);
        aliStock.updatePrice(11);


    }

}
