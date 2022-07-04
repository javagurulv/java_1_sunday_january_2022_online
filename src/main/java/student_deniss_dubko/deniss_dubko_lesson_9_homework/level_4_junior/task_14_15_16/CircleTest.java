package student_deniss_dubko.deniss_dubko_lesson_9_homework.level_4_junior.task_14_15_16;

class CircleTest {

    public static void main(String[] args) {

        CircleTest test = new CircleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        double radius = 3;
        double expectedArea = 28.274333882308138;

        Shape circle = new Circle("Circle", radius);
        double circleArea = circle.calculateArea();
        if (expectedArea == circleArea) {
            System.out.println("Test Calculate Area = OK");
        } else {
            System.out.println("Test Calculate Area = FAIL");
        }
    }

    public void calculatePerimeterTest() {
        double radius = 3;
        double expectedPerimeter = 18.84955592153876;

        Shape circle = new Circle("Circle", radius);
        double circlePerimeter = circle.calculatePerimeter();
        if (expectedPerimeter == circlePerimeter) {
            System.out.println("Test Calculate Perimeter = OK");
        } else {
            System.out.println("Test Calculate Perimeter = FAIL");
        }
    }

}