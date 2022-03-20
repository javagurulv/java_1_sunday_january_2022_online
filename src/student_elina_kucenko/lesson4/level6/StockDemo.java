package student_elina_kucenko.lesson4.level6;

class StockDemo {
    public static void main(String[] args) {
        Stock apple = new Stock("Apple", 10);
        String priceInformation = apple.getPriceInformation();
        System.out.println(priceInformation);


        apple.updatePrice(7);
        apple.updatePrice(12);
        apple.updatePrice(30);

        priceInformation = apple.getPriceInformation();
        System.out.println(priceInformation);
    }
}
