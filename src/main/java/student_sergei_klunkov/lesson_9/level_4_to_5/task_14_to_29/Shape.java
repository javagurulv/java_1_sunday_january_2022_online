package student_sergei_klunkov.lesson_9.level_4_to_5.task_14_to_29;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;

    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
