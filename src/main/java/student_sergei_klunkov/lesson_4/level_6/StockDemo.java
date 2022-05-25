package student_sergei_klunkov.lesson_4.level_6;

class StockDemo {

    public static void main(String[] args) {
        Stock microsoft = new Stock("Microsoft", 10);
        String information = microsoft.getPriceInfo();
        System.out.println(information);

        microsoft.updatePrice(11);
        microsoft.updatePrice(3);
        microsoft.updatePrice(22);

        information = microsoft.getPriceInfo();
        System.out.println(information);

    }

}
