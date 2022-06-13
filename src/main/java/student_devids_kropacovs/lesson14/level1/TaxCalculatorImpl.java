package student_devids_kropacovs.lesson14.level1;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator{


    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if(income.compareTo(new BigDecimal("20000")) <= 0){
            return income.multiply(new BigDecimal("0.25"));
        }
        return new BigDecimal("5000")
                    .add(income.subtract(new BigDecimal("20000")).multiply(new BigDecimal("0.40")));
    }
}
