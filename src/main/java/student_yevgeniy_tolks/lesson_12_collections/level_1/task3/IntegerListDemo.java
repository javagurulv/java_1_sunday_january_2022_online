package student_yevgeniy_tolks.lesson_12_collections.level_1.task3;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();

        for (int i = 0; i< 10;i++) {
            integerList.add(i);
        }
        System.out.println(integerList);

        integerList.add(0,123);
        integerList.add(integerList.size(), 321);
        integerList.remove(5);

        for(Integer list: integerList){
            System.out.println(list);
        }
        System.out.println(integerList.size());
        System.out.println(integerList.isEmpty());

    }
}
