package student_yevgeniy_tolks.lesson_9.level_4_5.task_14_27;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculateTriangleAreaTest();
        test.calculateTrianglePerimeterTest();
    }

    public void calculateTriangleAreaTest() {
        double baseLength = 10;
        double perpendicularHeight = 3;
        double expectedTriangleArea = 15;

        Shape triangle = new Triangle("Triangle", perpendicularHeight, baseLength,1,1);
        double resultOfTriangleArea = triangle.calculateArea();
        if (expectedTriangleArea == resultOfTriangleArea) {
            System.out.println("Calculate triangle area - TEST OK");
        } else {
            System.out.println("Calculate triangle area - TEST FAILED");
        }
    }

    public void calculateTrianglePerimeterTest() {
        double baseLength = 10;
        double sideA = 3;
        double sideB = 4;
        double expectedTrianglePerimeter = 17;

        Shape triangle = new Triangle("Triangle",2, baseLength, sideA, sideB);
        double resultOfTrianglePerimeter = triangle.calculatePerimeter();
        if (expectedTrianglePerimeter == resultOfTrianglePerimeter) {
            System.out.println("Calculate triangle perimeter - TEST OK");
        } else {
            System.out.println("Calculate triangle perimeter - TEST FAILED");
        }
    }
}
