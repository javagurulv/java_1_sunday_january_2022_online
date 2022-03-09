package student_alina_strumpe._lesson_3._level_7_senior_Task_29;

public class PrinterDemo {

    public static void main(String[] args){

        Printer brotherPrinter = new Printer("Brother","Black",399,false);
        Printer sisterPrinter = new Printer("Sister","White",399,false);
        Printer printer2 = new Printer("NNNNNN");

        String infoPrinter = brotherPrinter.name + ", " +brotherPrinter.color + ", " + brotherPrinter.price;
        System.out.println("Printer *1* model , "+"color, " + "price: "+infoPrinter);
        brotherPrinter.switchON();
        brotherPrinter.displayEmpty();
        brotherPrinter.switchOFF();


        String infoPrinter2 = sisterPrinter.name + ", "+ sisterPrinter.color+", "+ sisterPrinter.price;
        System.out.println("Printer *2*  model, "+ "color, "+ "price "+infoPrinter2);
        sisterPrinter.switchON();
        sisterPrinter.displayReady();
        sisterPrinter.switchOFF();


        String infoPrinter3 = printer2.name;
        System.out.println("Printer model: "+infoPrinter3);
        printer2.switchOFF();











    }
}
