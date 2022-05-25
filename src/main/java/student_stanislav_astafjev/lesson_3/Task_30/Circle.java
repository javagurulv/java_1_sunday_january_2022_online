package student_stanislav_astafjev.lesson_3.Task_30;

import java.util.Scanner;

class Circle {
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        this.radius = Math.pow(radius,5) * Math.PI;
        return radius;
    }
}
