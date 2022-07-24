package student_stanislav_astafjev.lesson_9.Task_14;

class Rectangle extends Shape {
    double sideA;
    double sideB;
    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    double calculateArea() {
        return sideA * sideB;
    }
    @Override
    double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }

}
