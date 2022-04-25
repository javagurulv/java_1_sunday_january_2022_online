package student_yevgeniy_tolks.lesson_9.level_4_5.task_14_29;

class Circle extends Shape {
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
