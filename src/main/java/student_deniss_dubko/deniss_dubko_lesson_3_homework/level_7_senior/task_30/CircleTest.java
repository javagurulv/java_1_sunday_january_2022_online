package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_7_senior.task_30;

public class CircleTest {

    // TO BE CONTINUED

    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.shouldShowOnConsoleRadius();
        // circleTest.shouldCalculateCircleArea();
        circleTest.shouldShowOnConsoleArea();
    }

    public void shouldShowOnConsoleRadius() {
        Circle circle = new Circle(10);
        String result = circle.showOnConsoleRadiusIs();
        if (("Radius is: " + circle.circleRadius).equals(result)) {
            System.out.println("Test Show Radius: OK");
        } else {
            System.out.println("Test Show Radius: FAIL");
        }
    }

    // add circleTest.shouldCalculateCircleArea();

    // To change

    public void shouldShowOnConsoleArea() {
        Circle circle = new Circle(10);
        String result = circle.calculateCircleArea();
        if (("Area is: " + circle.calculateCircleArea()).equals(result)) {
            System.out.println("Test Show Area: OK");
        } else {
            System.out.println("Test Show Area: FAIL");
        }
    }


}
