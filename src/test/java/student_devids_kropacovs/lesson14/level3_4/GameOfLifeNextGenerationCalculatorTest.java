package student_devids_kropacovs.lesson14.level3_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {

    private boolean[][] field;

    public GameOfLifeNextGenerationCalculatorTest() {

    }

    @Before
    public void createField(){
        field = new boolean[][]{{false, true, false},
                                {true, false, false},
                                {false, true, true}};
    }

    @Test
    public void test1CellDies(){
        GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();
        assertFalse(gameOfLifeNextGenerationCalculator.rule1(field, 0, 1));
    }

    @Test
    public void test2CellDiesOrBecomeDead(){
        GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();
        assertFalse(gameOfLifeNextGenerationCalculator.rule2(field, 1, 1));
    }

    @Test
    public void test3CellStaysAlive(){
        GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(gameOfLifeNextGenerationCalculator.rule3(field, 1, 0));
    }


}