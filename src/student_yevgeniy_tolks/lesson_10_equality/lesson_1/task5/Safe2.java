package student_yevgeniy_tolks.lesson_10_equality.lesson_1.task5;

class Safe2 {
    private String password;
    private int moneyAmountInSafe;

    public Safe2(String password, int moneyAmountInSafe) {
        this.password = password;
        this.moneyAmountInSafe = moneyAmountInSafe;
    }

    public int getMoneyAmountInSafe(String pass, int takenAmount) {
        if (this.password.equals(pass) && this.moneyAmountInSafe >= takenAmount) {
            this.moneyAmountInSafe -= takenAmount;
            return takenAmount;
        } else {
            return 0;
        }
    }

    public int putMoneyAmountInSafe(String pass, int depositedMoney) {
        if (this.password.equals(pass)) {
            this.moneyAmountInSafe += depositedMoney;
             return depositedMoney;
        } else {
            return 0;
        }
    }

    public int getSafeBalance() {
        return this.moneyAmountInSafe;
    }
}