package student_stanislav_astafjev.lesson_10.task_5;

public class Safe2 {
    private String pass;
    private double moneyAmountInSafe;

    public Safe2(String pass, double moneyAmountInSafe) {
        this.pass = String.valueOf(pass);
        this.moneyAmountInSafe = moneyAmountInSafe;
    }
    public double getMoneyAmountInSafe(String pass, double getMoneyFromSafe) {
        if (this.pass.equals(pass) && this.moneyAmountInSafe >= getMoneyFromSafe) {
            this.moneyAmountInSafe -= getMoneyFromSafe;
            return getMoneyFromSafe;
        } else {
            return 0;
        }
    }

    public double putMoneyAmountInSafe(String pass, double putMoneyInsideSafe) {
        if (this.pass.equals(pass)) {
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
