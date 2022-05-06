package student_sergei_klunkov.lesson_9.level_4.task_14;

class RectangleTest {

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculatePerimeterOfRectangle();
        test.calculateAreaOfRectangle();

    }

    public void calculatePerimeterOfRectangle() {

        double sideA = 4.0;
        double sideB = 6.0;
        double expectedResult = 20.0;

        Shape rectangle = new Rectangle("Circle", sideA, sideB);
        double resultOfRectanglePerimeter = rectangle.calculatePerimeter();
        if (expectedResult == resultOfRectanglePerimeter) {
            System.out.println(" Rectangle Perimeter Test " + " - Test passed! ");
        } else {
            System.out.println(" Rectangle Perimeter Test " + " - Test failed! ");
        }
    }

    public void calculateAreaOfRectangle() {

        double sideA = 4.0;
        double sideB = 6.0;
        double expectedResult = 24.0;

        Shape rectangle = new Rectangle("Circle", sideA, sideB);
        double resultOfRectangleArea = rectangle.calculateArea();
        if (expectedResult == resultOfRectangleArea) {
            System.out.println(" Rectangle Area Test " + " - Test passed! ");
        } else {
            System.out.println(" Rectangle Area Test " + " - Test failed! ");
        }
    }
}
