package student_alina_strumpe._lesson_3._level_2_intern._Task_15;

public class Phone {

    String model;

        public Phone(String model) {
            this.model = model;
        }

        String getModel() {
            return this.model;
        }

    }

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }
}
