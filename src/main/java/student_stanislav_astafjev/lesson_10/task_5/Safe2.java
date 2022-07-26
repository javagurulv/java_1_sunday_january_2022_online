package student_stanislav_astafjev.lesson_10.task_5;

import java.util.Objects;

public class Safe2 {
    private int pass;
    private double moneyAmountInSafe;

    public Safe2(String pass, double moneyAmountInSafe) {
        this.pass = Integer.parseInt(String.valueOf(pass));
        this.moneyAmountInSafe = moneyAmountInSafe;
    }
    public double getMoneyAmountInSafe(int pass, double getMoneyFromSafe) {
        if (!Objects.equals(this.pass, pass)) {
            return 0;
        } else {
            if (this.moneyAmountInSafe >= getMoneyFromSafe) {
                this.moneyAmountInSafe -= getMoneyFromSafe;
                return getMoneyFromSafe;
            } else {
                return 0;
            }
        }
    }

    public double putMoneyAmountInSafe(int pass, double putMoneyInsideSafe) {
        if (Objects.equals(this.pass, pass)) {
            this.moneyAmountInSafe += putMoneyInsideSafe;
            return putMoneyInsideSafe;
        } else {
            return 0;
        }
    }
    public double moneyInsideSafe() {
        return this.moneyAmountInSafe;
    }
}
