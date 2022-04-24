package student_yevgeniy_tolks.lesson_9.level_4.task_14;

abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
