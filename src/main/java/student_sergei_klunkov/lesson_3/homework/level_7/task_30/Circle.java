package student_sergei_klunkov.lesson_3.homework.level_7.task_30;

class Circle {

    private double radius;
    private double calculateArea;

    public Circle(double radius) {
        this.radius = radius;
        this.calculateArea = 0;

    }

    void calculateArea(){
        this.calculateArea = (Math.PI*radius*radius);
        System.out.println("Square is " + this.calculateArea);



    }

}
