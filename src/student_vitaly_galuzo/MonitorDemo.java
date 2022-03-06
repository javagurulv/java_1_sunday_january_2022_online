package student_vitaly_galuzo;

public class MonitorDemo {

    public static void main(String[] args) {


        Monitor samsung = new Monitor(true);
        Monitor sony = new Monitor(false);



        samsung.switchedOn();
        boolean power = samsung.isPower();
        System.out.println("Samsung power is on = "+ power);

        samsung.switchedOff();
        boolean power1 = samsung.isPower();
        System.out.println("Samsung power is off = "+power1);






    }








}
