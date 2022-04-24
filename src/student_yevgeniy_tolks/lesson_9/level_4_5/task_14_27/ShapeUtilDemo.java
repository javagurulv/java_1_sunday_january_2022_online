package student_yevgeniy_tolks.lesson_9.level_4_5.task_14_27;

class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = (int) shapeUtil.calculateArea(circle);
        double circlePerimeter = (int) shapeUtil.calculatePerimeter(circle);
        System.out.println(circle.getTitle() + " area = " + circleArea);
        System.out.println(circle.getTitle() + " perimeter = " + circlePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = (int) shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = (int) shapeUtil.calculatePerimeter(rectangle);
        System.out.println(rectangle.getTitle() + " area = " + rectangleArea);
        System.out.println(rectangle.getTitle() + " perimeter = " + rectanglePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = (int) shapeUtil.calculateArea(triangle);
        double trianglePerimeter = (int) shapeUtil.calculatePerimeter(triangle);
        System.out.println(triangle.getTitle() + " area = " + triangleArea);
        System.out.println(triangle.getTitle() + " perimeter = " + trianglePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = (int) shapeUtil.calculateArea(square);
        double squarePerimeter = (int) shapeUtil.calculatePerimeter(square);
        System.out.println(square.getTitle() + " area = " + squareArea);
        System.out.println(square.getTitle() + " perimeter = " + squarePerimeter);

    }
}
