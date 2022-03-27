package student_deniss_dubko.work_in_class;

public class RobotTest {

    // 1 - подготовка тестовых данных
    // 2 - вызов продакшен кода
    // 3 - проверка результатов

    public static void main(String[] args) {
        RobotTest robotTest = new RobotTest();
        robotTest.shouldSayHello();
        robotTest.shouldCreateArray();
    }

    public void shouldSayHello() {
        Robot robot = new Robot("Vasja");
        String result = robot.sayHello();
        if ("Hello!".equals(result)) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST FAIL");
        }
    }

    public void shouldCreateArray() {
        Robot robot = new Robot("Vasja");
        int[] array = robot.createArray(10);
        if (array.length == 10) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST FAIL");
        }
    }


}
