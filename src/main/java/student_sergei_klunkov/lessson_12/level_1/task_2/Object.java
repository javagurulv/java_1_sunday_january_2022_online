package student_sergei_klunkov.lessson_12.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

class Object {

    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("AirBus");
        Airplane airplane2 = new Airplane("Saab");
        Airplane airplane3 = new Airplane("Boeing 737");

        List<Airplane> airplaneList = new ArrayList<>();
        airplaneList.add(airplane1);
        airplaneList.add(airplane2);
        airplaneList.add(airplane3);

        for(Airplane airplane : airplaneList){
            System.out.println(airplane);
        }

    }

}
