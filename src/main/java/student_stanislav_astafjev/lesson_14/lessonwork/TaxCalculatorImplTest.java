package student_stanislav_astafjev.lesson_14.lessonwork;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
@Ignore
public class TaxCalculatorImplTest {

    //TaxCalculatorImplTest test = new TaxCalculatorImplTest()
     //test.init() @before
     //test.shouldReturn25ProcTaxBefore20k()@test
     //test.init() // @before
     //test.shouldReturnZero()//@test

    private TaxCalculator calculator;

    @Before
    public void init() {
        calculator = new TaxCalculatorImpl();

    }

    @Test //(expected = RuntimeException.class)
    public void shouldReturn25ProcTaxBefore20k() {
        double realTax = calculator.calculate(10000.0);
        assertEquals(realTax,22500.0,0.0001);
    }

    @Test
    public void shouldReturnZero() {
        double realTax = calculator.calculate(0.0);
        assertEquals(realTax,0.0,0.0001);
    }

    @Ignore
    public void shouldIgnore() {
        double realTax = calculator.calculate(0.0);
        assertEquals(realTax,0.0,0.0001);

    }
}
