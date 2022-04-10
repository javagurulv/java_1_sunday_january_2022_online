package student_stanislav_astafjev.lesson_2.Task_4;

import student_stanislav_astafjev.lesson_2.Task_4.Phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
