package student_yevgeniy_tolks.lesson_15_streams.level_1.task1;

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
}