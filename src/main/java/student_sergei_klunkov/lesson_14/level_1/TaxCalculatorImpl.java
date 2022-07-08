package student_sergei_klunkov.lesson_14.level_1;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculate(BigDecimal income) {
        if (income.compareTo(new BigDecimal(20000)) > 0) {
            BigDecimal incomeDeltaWhenAbove20k = income.subtract(new BigDecimal(20000));
            BigDecimal taxToPayAmountAbove20k = incomeDeltaWhenAbove20k.multiply(new BigDecimal("0.40"));
            BigDecimal taxToPayAmountBelow20k = new BigDecimal(20000).multiply(new BigDecimal("0.25"));
            return taxToPayAmountBelow20k.add(taxToPayAmountAbove20k);
        } else {
            return income.multiply(new BigDecimal("0.25"));
        }
    }
}
