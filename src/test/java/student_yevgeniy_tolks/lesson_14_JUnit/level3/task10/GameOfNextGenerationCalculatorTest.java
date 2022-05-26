package student_yevgeniy_tolks.lesson_14_JUnit.level3.task10;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfNextGenerationCalculatorTest {
    GameOfNextGenerationCalculator generationCalculator = new GameOfNextGenerationCalculator();

    @Test
    public void rule1LifeCellIfFewerThan2NeighborsDiesTest() {
        //given
        boolean[][] rule1TestArray = {
                {false, true, false},
                {false, true, false},
                {false, false, false}};
        //expected generation
        boolean[][] expectedNextGeneration = generationCalculator.calculate(rule1TestArray);
        //actual generation
        boolean[][] actualGeneration = {
                {false, false, false},
                {false, false, false},
                {false, false, false}};
        assertArrayEquals(expectedNextGeneration, actualGeneration);
    }

    @Test
    public void rule2LifeCellRemainsToLiveAmongTwoOrThreeNeighborsTest() {
        //given
        boolean[][] rule2TestArray = {
                {true, false, false},
                {false, true, false},
                {false, true, false}};
        //expected generation
        boolean[][] expectedNextGeneration = generationCalculator.calculate(rule2TestArray);
        //actual generation
        boolean[][] actualGeneration = {
                {false, false, false},
                {true, true, false},
                {false, false, false}};
        assertArrayEquals(expectedNextGeneration, actualGeneration);
    }

    @Test
    public void rule3LifeCellDiesAmongFourOrMoreNeighborsTest() {
        //given
        boolean[][] rule2TestArray = {
                {true, false, true},
                {true, true, false},
                {false, true, true}};
        //expected generation
        boolean[][] expectedNextGeneration = generationCalculator.calculate(rule2TestArray);
        //actual generation
        boolean[][] actualGeneration = {
                {true, false, false},
                {true, false, false},
                {true, true, true}};
        assertArrayEquals(expectedNextGeneration, actualGeneration);
    }

    @Test
    public void rule4DeadCellBecomesLifeAmongThreeNeighborsTest() {
        //given
        boolean[][] rule4TestArray = {
                {false, true, false},
                {false, true, false},
                {false, true, false}};
        //expected generation
        boolean[][] expectedNextGeneration = generationCalculator.calculate(rule4TestArray);
        //actual generation
        boolean[][] actualGeneration = {
                {false, false, false},
                {true, true, true},
                {false, false, false}};
        assertArrayEquals(expectedNextGeneration, actualGeneration);
    }
}