package student_yevgeniy_tolks.lesson_12_collections.level_1.task2;

import java.util.ArrayList;
import java.util.List;

class Object {

    public static void main(String[] args) {

        Car car1 = new Car("Ferrari");
        Car car2 = new Car("Ford");
        Car car3 = new Car("Maclaren");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        for (Car car:carList){
            System.out.println(car);
        }
    }
}
