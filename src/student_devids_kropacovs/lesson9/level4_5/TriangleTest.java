package student_devids_kropacovs.lesson9.level4_5;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.squareAreaTest();
        triangleTest.squarePerimeterTest();
    }

    public void squareAreaTest(){
        Triangle triangle = new Triangle("Triangle", 1.5197);
        double expectedResult = 1;
        if (expectedResult == triangle.calculateArea()){
            System.out.println("Triangle area test PASS");
        }else{
            System.out.println("Triangle Area test FAIL");
        }
    }

    public void squarePerimeterTest(){
        Triangle triangle = new Triangle("Triangle", 6);
        double expectedResult = 6 * 3;
        if (expectedResult == triangle.calculatePerimeter()){
            System.out.println("Triangle perimeter test PASS");
        }else{
            System.out.println("Triangle perimeter test FAIL");
        }
    }
}
