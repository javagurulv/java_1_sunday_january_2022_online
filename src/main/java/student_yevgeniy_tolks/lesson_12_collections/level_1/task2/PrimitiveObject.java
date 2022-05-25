package student_yevgeniy_tolks.lesson_12_collections.level_1.task2;

import java.util.ArrayList;
import java.util.List;

class PrimitiveObject {
    public static void main(String[] args) {

        //Wrapper class used to convert primitive to object
        List<Integer> primitiveObjects = new ArrayList<>();
        primitiveObjects.add(1);
        primitiveObjects.add(2);
        primitiveObjects.add(3);

        for(Integer num: primitiveObjects){
            System.out.println(num);
        }
    }
}
