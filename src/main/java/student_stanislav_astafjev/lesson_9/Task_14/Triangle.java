package student_stanislav_astafjev.lesson_9.Task_14;

class Triangle extends Shape {
    private double perpendicularHeight;
    private double baseLength;
    private double sideA;
    private double sideB;
    public Triangle(String title, double perpendicularHeight, double baseLength,double sideA, double sideB) {
        super(title);
        this.perpendicularHeight = perpendicularHeight;
        this.baseLength = baseLength;
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    double calculateArea() {
        return ((perpendicularHeight * baseLength) / 2);
    }
    @Override
     double calculatePerimeter() {
        return sideA + sideB + baseLength;
    }
}
