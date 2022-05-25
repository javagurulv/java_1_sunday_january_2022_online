package student_devids_kropacovs.lesson10.level1.task5;

public class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe2 = new Safe2(1234, 10000);
        safe2.getMoney(1234, 100);
        safe2.putMoney(1234, 50000);
        safe2.getMoney(222, 1231234);
    }
}
