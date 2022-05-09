package student_sergei_klunkov.lesson_9.level_4_to_5.task_14_to_29;

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
