package student_yevgeniy_tolks.lesson_15_streams.level_1_2.task1_7;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {
    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void findGreenApplesTest() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedGreenAppleList = fruitStorage.findGreenApplesInWarehouse(inventory);
         assertEquals(expectedGreenAppleList.size(), 3);
    }
    @Test
    public void findRedApplesTest(){
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedGreenAppleList = fruitStorage.findGreenApplesInWarehouse(inventory);
        assertEquals(expectedGreenAppleList.size(), 3);
    }

    @Test
    public void findApplesByColorTest(){
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedAppleColor = fruitStorage.findApplesByColor(inventory,"yellow");
        assertEquals(expectedAppleColor.size(),2);
    }
    @Test
    public void findApplesByWeightTest(){
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedAppleByWeight = fruitStorage.findApplesByWeight(inventory,80);
        assertEquals(expectedAppleByWeight.size(),6);
    }
    @Test
    public void findAppleGreenColorTest(){
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedGreenApple = fruitStorage.findApples(inventory,new AppleGreenColorPredicate());
        assertEquals(expectedGreenApple.size(),3);
    }
    @Test
    public void findAppleRedColorTest(){
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedRedApple = fruitStorage.findApples(inventory,new AppleRedColorPredicate());
        assertEquals(expectedRedApple.size(),3);
    }

    @Test
    public void findHeavyWeightAppleTest(){
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedHeavyApple = fruitStorage.findApples(inventory,new AppleHeavyWeightPredicate());
        assertEquals(expectedHeavyApple.size(),4);
    }

    @Test
    public void findLightWeightAppleTest(){
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expectedLightApple = fruitStorage.findApples(inventory,new AppleLightWeightPredicate());
        assertEquals(expectedLightApple.size(),4);
    }
}