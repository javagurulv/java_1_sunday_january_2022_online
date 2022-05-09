package student_sergei_klunkov.lesson_9.level_4.task_14_to_task_29;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return (Math.PI * radius*radius);
    }

    @Override
    double calculatePerimeter() {
        return (2* Math.PI* radius);
    }
}
