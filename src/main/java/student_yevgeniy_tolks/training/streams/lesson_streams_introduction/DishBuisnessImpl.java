package student_yevgeniy_tolks.training.streams.lesson_streams_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class DishBusinessImpl {
    private final List<Dish> menu = List.of(
            new Dish("pork", false, 800, Type.MEAT),
            new Dish("beef", false, 700, Type.MEAT),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("french fries", true, 530, Type.OTHER),
            new Dish("rice", true, 350, Type.OTHER),
            new Dish("season fruit", true, 120, Type.OTHER),
            new Dish("pizza", true, 550, Type.OTHER),
            new Dish("prawns", false, 300, Type.FISH),
            new Dish("salmon", false, 450, Type.FISH));

    public List<String> getThreeNameOfDishWithCaloriesOver300() {
        List<String> dishNames =
                menu.stream()
                        .filter(dish -> {
                            System.out.println("filtering:" + dish.getCalories());
                            return dish.getCalories() < 400;
                        })
                        .map(dish -> {
                            System.out.println("mapping:" + dish.getName());
                            return dish.getName();
                        })
                        .limit(5)
                        .collect(toList());
        System.out.println(dishNames);
        return dishNames;
    }

    public List<Dish> showVegetarianMenu() {
        return menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
    }

    public List<String> getNameOfAllFishDishes() {
        return menu.stream()
                .filter(dish -> dish.getType().equals(Type.FISH))
                .map(dish -> dish.getName())
                .collect(toList());
    }

    public List<Integer> getEachDishWordLengthWithCaloriesFewerThan350() {
        return menu.stream()
                .filter(dish -> dish.getCalories() < 350)
                .map(Dish::getName)
                .map(dish -> dish.length())
                .collect(Collectors.toList());
    }

    public List<String> findFirstOtherDishNameUniqueCharacters() {
        return menu.stream()
                .filter(dish -> dish.getType().equals(Type.OTHER))
                .limit(1)
                .map(dish -> dish.getName().split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public int sumOfAllCaloriesInTheList() {
        return menu.stream().
                mapToInt(Dish::getCalories).sum();
    }
}