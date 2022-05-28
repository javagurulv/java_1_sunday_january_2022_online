package student_yevgeniy_tolks.lesson_15_streams.level_1_2.task1_7;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    //method to find all green apples
    public List<Apple> findGreenApplesInWarehouse(List<Apple> inventory) {
        List<Apple> greenApplesList = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                greenApplesList.add(apple);
            }
        }
        return greenApplesList;
    }

    public List<Apple> findRedApplesInWarehouse(List<Apple> inventory) {
        List<Apple> greenApplesList = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("red".equals(apple.getColor())) {
                greenApplesList.add(apple);
            }
        }
        return greenApplesList;
    }

    public List<Apple> findApplesByColor(List<Apple> inventory, String color) {
        List<Apple> greenApplesList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                greenApplesList.add(apple);
            }
        }
        return greenApplesList;
    }

    public List<Apple> findApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> listByWeights = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                listByWeights.add(apple);
            }
        }
        return listByWeights;
    }

}
