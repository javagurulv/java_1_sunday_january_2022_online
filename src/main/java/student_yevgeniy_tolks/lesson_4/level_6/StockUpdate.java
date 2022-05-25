package student_yevgeniy_tolks.lesson_4.level_6;

class StockUpdate {
    public static void main(String[] args) {

        Stock caterpillar = new Stock("MaK Caterpillar", 10);
        String getInformation = caterpillar.getPriceInformation();
        System.out.println(getInformation);

        caterpillar.updatePrice(15);
        caterpillar.updatePrice(7);
        caterpillar.updatePrice(14);

        getInformation = caterpillar.getPriceInformation();
        System.out.println(getInformation);

    }
}