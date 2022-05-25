package student_stanislav_astafjev.lesson_4.Task_17;

class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("Google",10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
