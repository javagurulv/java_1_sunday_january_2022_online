package student_vitaly_galuzo.lesson_4.level_6;

public class StockDemo {

    public static void main(String[] args) {
        Stock asRock = new Stock("ASrock",10);
        String information = asRock.getPriceInformation();
        System.out.println(information);

        asRock.updatePrice(10);
        asRock.updatePrice(5);
        asRock.updatePrice(7);

        information = asRock.getPriceInformation();
        System.out.println(information);


    }


}
