package student_yevgeniy_tolks.training.streams.lesson_streams_introduction;

import java.util.List;

public class DishTest {
    public static void main(String[] args) {
        DishTest test = new DishTest();
    test.test1();
    }

     public void test1() {
         List<Dish> menu = List.of(
                 new Dish("pork", false, 800, Type.MEAT),
                 new Dish("beef", false, 700, Type.MEAT),
                 new Dish("chicken", false, 400, Type.MEAT),
                 new Dish("french fries", true, 530, Type.OTHER),
                 new Dish("rice", true, 350, Type.OTHER),
                 new Dish("season fruit", true, 120, Type.OTHER),
                 new Dish("pizza", true, 550, Type.OTHER),
                 new Dish("prawns", false, 300, Type.FISH),
                 new Dish("salmon", false, 450, Type.FISH));
         System.out.println(menu);

         DishBusinessImpl dishBusinessimpl = new DishBusinessImpl();
         List<String> printBusinessRequest = dishBusinessimpl.getThreeNameOfDishWithCaloriesOver300();
         System.out.println(printBusinessRequest);
         List<Dish> printVeganBusinessRequest = dishBusinessimpl.showVegetarianMenu();
         System.out.println(printVeganBusinessRequest);
         List<String> printFishDish = dishBusinessimpl.getNameOfAllFishDishes();
         System.out.println(printFishDish);
         List<Integer> printWordLengthOfDishWithCaloriesFewerThan350 = dishBusinessimpl.getEachDishWordLengthWithCaloriesFewerThan350();
         System.out.println(printWordLengthOfDishWithCaloriesFewerThan350);
         List<String> printFirstOtherDishNameUniqueCharacters=dishBusinessimpl.findFirstOtherDishNameUniqueCharacters();
         System.out.println(printFirstOtherDishNameUniqueCharacters);
         int sumOfAllCalories = dishBusinessimpl.sumOfAllCaloriesInTheList();
         System.out.println(sumOfAllCalories);
    }
}
