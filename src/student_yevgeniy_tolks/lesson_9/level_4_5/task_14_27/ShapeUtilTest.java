package student_yevgeniy_tolks.lesson_9.level_4_5.task_14_27;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateShapeCommonAreaTest();
        shapeUtilTest.calculateShapeCommonPerimeterTest();
    }

    public void calculateShapeCommonAreaTest() {

        Shape[] shape = new Shape[4];
        shape[0] = new Circle("Circle", 4);
        shape[1] = new Square("Square ", 4);
        shape[2] = new Rectangle("Rectangle", 4, 4);
        shape[3] = new Triangle("Triangle", 4, 4, 4, 4);

        double expectedCommonArea = 90;

        ShapeUtil shapeUtil = new ShapeUtil();
        double resultOfCalculatedCommonArea = (int) (shapeUtil.calculateArea(shape));
        if (expectedCommonArea == resultOfCalculatedCommonArea) {
            System.out.println("Calculate shapes common area - TEST OK");
        } else {
            System.out.println("Calculate shapes common area - Test FAILED");
        }
    }

    public void calculateShapeCommonPerimeterTest() {

        Shape[] shape = new Shape[4];
        shape[0] = new Circle("Circle", 4);
        shape[1] = new Square("Square ", 4);
        shape[2] = new Rectangle("Rectangle", 4, 4);
        shape[3] = new Triangle("Triangle", 4, 4, 4, 4);

        double expectedCommonPerimeter = 69;

        ShapeUtil shapeUtil = new ShapeUtil();
        double resultOfCalculatedCommonPerimeter = (int) (shapeUtil.calculatePerimeter(shape));
        if (expectedCommonPerimeter == resultOfCalculatedCommonPerimeter) {
            System.out.println("Calculate shapes common area - TEST OK");
        } else {
            System.out.println("Calculate shapes common area - Test FAILED");
        }
    }

}
