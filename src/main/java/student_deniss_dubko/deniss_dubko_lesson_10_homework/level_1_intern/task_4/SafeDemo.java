package student_deniss_dubko.deniss_dubko_lesson_10_homework.level_1_intern.task_4;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe(1234, 5000);
        int password = safe.password;
        System.out.println(password);
        int moneyAmount = safe.moneyAmount;
        System.out.println(moneyAmount);
    }

}