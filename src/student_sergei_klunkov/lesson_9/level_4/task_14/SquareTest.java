package student_sergei_klunkov.lesson_9.level_4.task_14;

class SquareTest {

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculatePerimeterOfSquare();
        test.calculateAreaOfSquare();
    }

    public void calculatePerimeterOfSquare() {

        double sideLength = 5.0;
        double expectedResult = 20.0;

        Shape square = new Square("Square", sideLength);
        double resultOfSquarePerimeter = square.calculatePerimeter();
        if (resultOfSquarePerimeter == expectedResult) {
            System.out.println(" Square Perimeter Test " + " - Test passed! ");
        } else {
            System.out.println(" Square Perimeter Test " + " - Test failed! ");
        }
    }

    public void calculateAreaOfSquare() {

        double sideLength = 5.0;
        double expectedResult = 25.0;

        Shape square = new Square("Square", sideLength);
        double resultOfSquareArea = square.calculateArea();
        if (resultOfSquareArea == expectedResult) {
            System.out.println(" Square Area Test " + " - Test passed! ");
        } else {
            System.out.println(" Square Area Test " + " - Test failed! ");
        }
    }
}
