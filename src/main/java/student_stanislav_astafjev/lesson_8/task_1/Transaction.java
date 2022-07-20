package student_stanislav_astafjev.lesson_8.task_1;

class Transaction {
    private Trader trader;
    private int amount;

    public Transaction(Trader trader,int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                "}";
    }

    public Trader getTrader() {
        return this.trader;
    }
    public int getAmount() {
        return this.amount;
    }
}
