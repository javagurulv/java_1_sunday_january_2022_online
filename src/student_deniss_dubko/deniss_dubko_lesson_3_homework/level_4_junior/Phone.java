package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_4_junior;

class Phone {

    private String model;

        Phone(String newModel) {
            this.model = newModel;
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