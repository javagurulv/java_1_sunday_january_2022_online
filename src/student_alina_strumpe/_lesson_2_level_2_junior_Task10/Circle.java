package student_alina_strumpe._lesson_2_level_2_junior_Task10;

public class Circle {

            public float circleRadius;


               public float calculate(float circleRadius) {

                   float circlePerimeter = (float) (2 * Math.PI * circleRadius);
                   float Area = (float) (Math.PI * circleRadius * circleRadius);
                   return (float) circlePerimeter + (float) Area;

                }

               }



    //double perimeter = 2 * Math.PI * radius;
    //double area = Math.PI * radius * radius;