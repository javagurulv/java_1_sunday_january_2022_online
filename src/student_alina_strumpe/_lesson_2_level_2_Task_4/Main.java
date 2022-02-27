package student_alina_strumpe._lesson_2_level_2_Task_4;


public class Main {
    public static void main(String[] args) {


        Phone phone_1 = new Phone();
        phone_1.phModel = "Galaxy";
        phone_1.phID = 111;
        phone_1.phPrice = 800.50f;

        Phone phone_2 = new Phone();
        phone_2.phModel = "Galaxy100";
        phone_2.phID = 1115;
        phone_2.phPrice = 730.35f;

        Phone phone_3 = new Phone();
        phone_3.phModel = "Galaxy101";
        phone_3.phID = 109;
        phone_3.phPrice = 654.15f;

        float c = phone_1.phPrice+phone_2.phPrice+phone_3.phPrice;


        System.out.println("Phone name: " + phone_1.phModel +"\n"+ "ID: " + phone_1.phID +"\n" + "Price: " +
                phone_1.phPrice + "\n" + "Phone name: " + phone_2.phModel +"\n"+ "ID: " + phone_2.phID +"\n" + "Price: " +
                        phone_2.phPrice + "\n" + "Phone name: " + phone_3.phModel +"\n"+ "ID: " + phone_3.phID +"\n" + "Price: "
                + phone_3.phPrice);
        System.out.println("The sum is: " + c );














    }





}

