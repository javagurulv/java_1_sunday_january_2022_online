package student_yevgeniy_tolks.lesson_9.level_4_5.task_14_29;

class Square extends Shape {

    private double sideLength;

    public Square(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (sideLength + sideLength);
    }
}
