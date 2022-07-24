package student_stanislav_astafjev.lesson_9.Task_14;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculateRectangleAreaTest();
        test.calculateRectanglePerimeterTest();
    }
    public void calculateRectangleAreaTest() {
        double sideA = 4;
        double sideB = 8;
        double expectedRectangleArea = 32;
        Shape rectangle = new Rectangle("Rectangle", sideA, sideB);
        double resultOfRectangleArea = rectangle.calculateArea();
        if (expectedRectangleArea == resultOfRectangleArea) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }
    public void calculateRectanglePerimeterTest() {
        double sideA = 4;
        double sideB = 8;
        double expectedRectanglePerimeter = 24;
        Shape rectangle = new Rectangle("Rectangle", sideA, sideB);
        double resultOfRectanglePerimeter = rectangle.calculatePerimeter();
        if (expectedRectanglePerimeter == resultOfRectanglePerimeter) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }
}
