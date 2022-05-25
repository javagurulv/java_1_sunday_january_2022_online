package student_anna_zhoydik.lesson_3.level_7.task_30;

public class Circle {
  double radius;
  Circle(double circleRadius) {
    this.radius = circleRadius;
  }
 public void printInfo(){
   System.out.println("S="+this.radius);
 }

 public double calculateArea() {
    this.radius=3.14*this.radius*this.radius;
    return this.radius;
  }
}
