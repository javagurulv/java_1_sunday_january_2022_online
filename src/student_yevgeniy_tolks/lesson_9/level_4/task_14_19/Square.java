package student_yevgeniy_tolks.lesson_9.level_4.task_14_19;

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
