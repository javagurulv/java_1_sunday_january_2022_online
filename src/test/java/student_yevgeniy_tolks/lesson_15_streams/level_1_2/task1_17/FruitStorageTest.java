package student_yevgeniy_tolks.lesson_15_streams.level_1_2.task1_17;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {
    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void findGreenApplesTest() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedGreenAppleList = fruitStorage.findGreenApplesInWarehouse(inventory);
        String getColor = expectedGreenAppleList.get(0).getColor();
        String getColor1 = expectedGreenAppleList.get(1).getColor();
        String getColor2 = expectedGreenAppleList.get(2).getColor();
        assertEquals(expectedGreenAppleList.size(), 3);
        assertEquals(getColor, "green");
        assertEquals(getColor1, "green");
        assertEquals(getColor2, "green");
    }

    @Test
    public void findRedApplesTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedRedAppleList = fruitStorage.findRedApplesInWarehouse(inventory);
        String getColor = expectedRedAppleList.get(0).getColor();
        assertEquals(expectedRedAppleList.size(), 3);
        assertEquals(getColor, "red");
    }

    @Test
    public void findApplesByColorTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedAppleColor = fruitStorage.findApplesByColor(inventory, "yellow");
        String getColor = expectedAppleColor.get(0).getColor();
        assertEquals(expectedAppleColor.size(), 2);
        assertEquals(getColor, "yellow");

    }

    @Test
    public void findApplesByWeightTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedAppleByWeight = fruitStorage.findApplesByWeight(inventory, 80);
        assertEquals(expectedAppleByWeight.size(), 6);
    }

    @Test
    public void findAppleGreenColorTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedGreenApple = fruitStorage.findApples(inventory, new AppleGreenColorPredicate());
        String getColor = expectedGreenApple.get(0).getColor();
        assertEquals(expectedGreenApple.size(), 3);
        assertEquals(getColor, "green");
    }

    @Test
    public void findAppleRedColorTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedRedApple = fruitStorage.findApples(inventory, new AppleRedColorPredicate());
        String getColor = expectedRedApple.get(0).getColor();
        assertEquals(expectedRedApple.size(), 3);
        assertEquals(getColor, "red");
    }

    @Test
    public void findHeavyWeightAppleTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedHeavyApple = fruitStorage.findApples(inventory, new AppleHeavyWeightPredicate());
        assertEquals(expectedHeavyApple.size(), 4);
    }

    @Test
    public void findLightWeightAppleTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedLightApple = fruitStorage.findApples(inventory, new AppleLightWeightPredicate());
        assertEquals(expectedLightApple.size(), 4);
    }

    @Test
    public void appleGreenAndHeavyWeightPredicateTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedAppleGreenAndHeavyWeightList = fruitStorage.findApples(
                inventory, new AppleGreenAndHeavyWeightPredicate());
        assertEquals(expectedAppleGreenAndHeavyWeightList.size(), 1);
    }

    @Test
    public void findAppleGreenColorWithAnonymousClassTest() {
        ApplePredicate greenApplePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        };
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedGreenApple = fruitStorage.findApples(inventory, greenApplePredicate);
        String getColor = expectedGreenApple.get(0).getColor();
        assertEquals(expectedGreenApple.size(), 3);
        assertEquals(getColor, "green");
    }

    @Test
    public void findRedColorWithAnonymousClassTest() {
        ApplePredicate redApplePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        };
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedRedApple = fruitStorage.findApples(inventory, redApplePredicate);
        assertEquals(expectedRedApple.size(), 3);
    }

    @Test
    public void findHeavyWeightAppleWithAnonymousClassTest() {
        ApplePredicate heavyApplePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        };
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedHeavyApple = fruitStorage.findApples(inventory, heavyApplePredicate);
        assertEquals(expectedHeavyApple.size(), 4);
    }

    @Test
    public void findLightWeightAppleWithAnonymousClassTest() {
        ApplePredicate lightApplePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        };
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedLightApple = fruitStorage.findApples(inventory, lightApplePredicate);
        assertEquals(expectedLightApple.size(), 4);
    }

    @Test
    public void findAppleGreenColorWithLambdaExpressionTest() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedGreenApple = fruitStorage.findApples(inventory,
                apple -> "green".equals(apple.getColor()));
        String getColor = expectedGreenApple.get(0).getColor();
        assertEquals(expectedGreenApple.size(), 3);
        assertEquals(getColor, "green");
    }

    @Test
    public void findRedColorWithLambdaExpressionTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedRedApple = fruitStorage.findApples(inventory,
                (apple) -> "red".equals(apple.getColor()));
        String getColor = expectedRedApple.get(0).getColor();
        assertEquals(expectedRedApple.size(), 3);
        assertEquals(getColor, "red");
    }

    @Test
    public void findHeavyWeightAppleWithLambdaExpressionTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedHeavyApple = fruitStorage.findApples(inventory,
                apple -> apple.getWeight() > 150);
        assertEquals(expectedHeavyApple.size(), 4);
    }

    @Test
    public void findLightWeightAppleWithLambdaExpressionTest() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedLightApple = fruitStorage.findApples(inventory,
                apple -> apple.getWeight() < 150);
        assertEquals(expectedLightApple.size(), 4);
    }
}