package student_devids_kropacovs.lesson12.level1;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        Integer integer = 3;
        integerList.add(integer);
        //It may look like we can add both objects and primitive data types, in the first example, we do not add simple integer,
        // instead java transform this number 3 to an object
    }
}
