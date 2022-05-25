package student_yevgeniy_tolks.lesson_9.level_4_5.task_14_29;

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
            System.out.println("Calculate rectangle area - TEST OK");
        } else {
            System.out.println("Calculate rectangle area - TEST FAILED");
        }
    }
    public void calculateRectanglePerimeterTest() {
        double sideA = 4;
        double sideB = 8;
        double expectedRectanglePerimeter = 24;

        Shape rectangle = new Rectangle("Rectangle", sideA, sideB);
        double resultOfRectanglePerimeter = rectangle.calculatePerimeter();
        if (expectedRectanglePerimeter == resultOfRectanglePerimeter) {
            System.out.println("Calculate rectangle perimeter - TEST OK");
        } else {
            System.out.println("Calculate rectangle perimeter - TEST FAILED");
        }
    }
}
