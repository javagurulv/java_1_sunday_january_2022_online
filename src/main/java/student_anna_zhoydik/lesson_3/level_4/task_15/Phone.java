package student_anna_zhoydik.lesson_3.level_4.task_15;

class Phone {

  String model;

    Phone(String newModel) {
      this.model = newModel;
    }

    String newModel() {
      return this.model;
    }

  }

  class PhoneDemo {

    public static void main(String[] args) {
      Phone myPhone = new Phone("Huawei");
      String phoneModel = myPhone.newModel();
      System.out.println("Phone model = " + phoneModel);
    }

  }
