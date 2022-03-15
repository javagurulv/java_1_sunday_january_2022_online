package student_devids_kropacovs.lesson_4.level_6;

class StockDemo {
    public static void main(String[] args) {
        Stock stock1 = new Stock("GOOGLE", 100);
        stock1.updatePrice(50);
        stock1.updatePrice(110);
        stock1.updatePrice(45);
        stock1.updatePrice(60);
        stock1.updatePrice(105);
        stock1.updatePrice(90);
        stock1.getPriceInformation();


    }
}
