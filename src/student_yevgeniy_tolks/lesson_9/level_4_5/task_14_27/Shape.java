package student_yevgeniy_tolks.lesson_9.level_4_5.task_14_27;

abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
