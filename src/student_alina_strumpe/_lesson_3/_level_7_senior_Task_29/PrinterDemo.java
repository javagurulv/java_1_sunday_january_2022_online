package student_alina_strumpe._lesson_3._level_7_senior_Task_29;

public class PrinterDemo {

    public static void main(String[] args){

        Printer brotherPrinter = new Printer("Brother","Black",399,false);
        Printer brotherPrinter2 = new Printer("Syster","BWhite",399,false);

        String infoPrinter = brotherPrinter.pName + ", " +brotherPrinter.pColor + ", " + brotherPrinter.pPrice;
        System.out.println("Printer *1* model , "+"color, " + "price: "+infoPrinter);

        brotherPrinter.switchON();

        brotherPrinter.displayEmpty();

        brotherPrinter.switchOFF();


        String infoPrinter2 = brotherPrinter2.pName + ", "+ brotherPrinter2.pColor+", "+ brotherPrinter2.pPrice;
        System.out.println("Printer *2*  model, "+ "color, "+ "price "+infoPrinter2);

        brotherPrinter2.switchON();
        brotherPrinter2.displayReady();
        brotherPrinter2.switchOFF();









    }
}
