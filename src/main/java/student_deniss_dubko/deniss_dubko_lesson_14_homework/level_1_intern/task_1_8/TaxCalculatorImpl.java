package student_deniss_dubko.deniss_dubko_lesson_14_homework.level_1_intern.task_1_8;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculate(BigDecimal income) {
        if (income.compareTo(new BigDecimal(20000)) > 0) {
            BigDecimal incomeAbove20k = income.subtract(new BigDecimal(20000));
            BigDecimal taxIncomeAbove20k = incomeAbove20k.multiply(new BigDecimal(0.4));
            BigDecimal taxIncomeBelow20k = new BigDecimal(20000).multiply(new BigDecimal(0.25));
            return taxIncomeBelow20k.add(taxIncomeAbove20k);
        } else {
            return income.multiply(new BigDecimal(0.25));
        }
    }

}