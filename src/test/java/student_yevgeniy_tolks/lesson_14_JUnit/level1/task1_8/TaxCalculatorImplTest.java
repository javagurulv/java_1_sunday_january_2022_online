package student_yevgeniy_tolks.lesson_14_JUnit.level1.task1_8;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxCalculatorImplTest {
    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void taxPaymentWhenIncomeIsZeroTest() {
        BigDecimal income = BigDecimal.ZERO;
        BigDecimal expectedTaxToPay = taxCalculator.calculate(income);
        assertEquals(expectedTaxToPay, new BigDecimal("0.00"));
    }

    @Test
    public void taxPaymentWhenIncomeEquals20k() {
        BigDecimal income = new BigDecimal(20000);
        BigDecimal expectedTaxToPay = taxCalculator.calculate(income);
        assertEquals(expectedTaxToPay, new BigDecimal("5000.00"));
    }

    @Test
    public void taxPaymentWhenIncomeIsLessThan20k() {
        BigDecimal income = new BigDecimal(5000);
        BigDecimal expectedTaxToPay = taxCalculator.calculate(income);
        assertEquals(expectedTaxToPay, new BigDecimal("1250.00"));
    }

    @Test
    public void taxPaymentWhenIncomeEquals30k() {
        BigDecimal income = new BigDecimal(30000);
        BigDecimal expectedTaxToPay = taxCalculator.calculate(income);
        assertEquals(expectedTaxToPay, new BigDecimal("9000.00"));
    }

    @Test
    public void taxPaymentWhenIncomeTaxLessThan30k(){
        BigDecimal income = new BigDecimal(24000);
        BigDecimal expectedTaxToPay  = taxCalculator.calculate(income);
        assertEquals(expectedTaxToPay,new BigDecimal("6600.00"));
    }
}