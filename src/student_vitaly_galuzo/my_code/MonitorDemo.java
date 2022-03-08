package student_vitaly_galuzo.my_code;

import student_vitaly_galuzo.my_code.Monitor;

public class MonitorDemo {

    public static void main(String[] args) {


        Monitor samsung = new Monitor(true);
        Monitor sony = new Monitor(true);



        samsung.switchedOn();
        boolean power = samsung.isPower();
        System.out.println("Samsung power is on = "+ power);

        samsung.switchedOff();
        boolean power1 = samsung.isPower();
        System.out.println("Samsung power is off = "+power1);






    }

}
