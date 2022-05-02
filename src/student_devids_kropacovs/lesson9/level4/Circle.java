package student_devids_kropacovs.lesson9.level4;

class Circle extends Shape{

    private double radius;
    private final double pi = 3.14;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double calculateArea() {
        return this.radius * this.radius * this.pi;
    }

    @Override
    double calculatePerimeter() {
        return 2 * this.radius * this.pi;
    }
}
