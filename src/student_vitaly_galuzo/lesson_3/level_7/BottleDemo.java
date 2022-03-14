package student_vitaly_galuzo.lesson_3.level_7;

public class BottleDemo {

    public static void main(String[] args) {

       Bottle bottle = new Bottle(true,true,"Evian");

       String bottleBrand = bottle.getBrand();
       bottle.opened();
            boolean bottleOpen = bottle.isOpen();
       System.out.println(bottleBrand+" "+"bottle is open - "+bottleOpen);
       bottle.closed();
            boolean bottleClosed = bottle.isOpen();
       System.out.println(bottleBrand+" "+"bottle is closed - "+bottleClosed);
       bottle.notFilled();
             boolean bottleEmpty = bottle.isEmpty();
       System.out.println(bottleBrand+" "+"bottle is empty - "+bottleEmpty);
       bottle.filled();
            boolean bottleFilled = bottle.isEmpty();
       System.out.println(bottleBrand+" "+"bottle is filled - "+bottleFilled);

       }

    }






