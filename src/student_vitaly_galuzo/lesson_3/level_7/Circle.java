package student_vitaly_galuzo.lesson_3.level_7;

import student_yevgeniy_tolks.lesson_3.level_7.CircleDemo;

public class Circle {

    private double radius;



    Circle(double radius){
        this.radius = radius;

    }

    public double calculateArea() {
        this.radius = radius * radius * Math.PI;
        return radius;


    }

}
