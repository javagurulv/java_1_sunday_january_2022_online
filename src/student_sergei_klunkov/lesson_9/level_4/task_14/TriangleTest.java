package student_sergei_klunkov.lesson_9.level_4.task_14;

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculatePerimeterOfTriangle();
        test.calculateAreaOfTriangle();

    }

    public void calculatePerimeterOfTriangle() {

        double baseSideOfTriangle = 2.0;
        double secondSideOfTriangle = 3.0;
        double thirdSideOfTriangle = 1.0;
        double heightOfTriangle = 2.0;

        double expectedResult = 6.0;

        Shape triangle = new Triangle("Triangle", baseSideOfTriangle, secondSideOfTriangle, thirdSideOfTriangle, heightOfTriangle);
        double resultOfTrianglePerimeter = triangle.calculatePerimeter();
        if ( expectedResult == resultOfTrianglePerimeter ) {
            System.out.println(" Triangle Perimeter Test " + " - Test passed! ");
        } else {
            System.out.println(" Triangle Perimeter Test " + " - Test failed! ");
        }
    }

    public void calculateAreaOfTriangle() {

        double baseSideOfTriangle = 2.0;
        double secondSideOfTriangle = 3.0;
        double thirdSideOfTriangle = 1.0;
        double heightOfTriangle = 2.0;

        double expectedResult = 2.0;

        Shape triangle = new Triangle("Triangle", baseSideOfTriangle, secondSideOfTriangle, thirdSideOfTriangle, heightOfTriangle);
        double resultOfTriangleArea = triangle.calculateArea();
        if ( expectedResult == resultOfTriangleArea ) {
            System.out.println(" Triangle Area Test " + " - Test passed! ");
        } else {
            System.out.println(" Triangle Area Test " + " - Test failed! ");
        }
    }
}
