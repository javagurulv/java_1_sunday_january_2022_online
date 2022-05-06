package student_sergei_klunkov.lesson_9.level_4.task_14;

class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return (sideA*sideB);
    }

    @Override
    double calculatePerimeter() {
        return 2*(sideA+sideB);
    }
}
