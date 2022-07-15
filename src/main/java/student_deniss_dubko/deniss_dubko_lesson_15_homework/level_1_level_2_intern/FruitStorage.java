package student_deniss_dubko.deniss_dubko_lesson_15_homework.level_1_level_2_intern;

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

    public List<Apple> findApplesByColour(List<Apple> inventory,
                                          String colour) {
        List<Apple> greenApplesList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(colour)) {
                greenApplesList.add(apple);
            }
        }
        return greenApplesList;
    }

    public List<Apple> findApplesByWeight(List<Apple> inventory,
                                          int weight) {
        List<Apple> listByWeight = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                listByWeight.add(apple);
            }
        }
        return listByWeight;
    }

    public List<Apple> findApples(List<Apple> inventory,
                                  ApplePredicate applePredicate) {
        List<Apple> appleList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                appleList.add(apple);
            }
        }
        return appleList;
    }

}