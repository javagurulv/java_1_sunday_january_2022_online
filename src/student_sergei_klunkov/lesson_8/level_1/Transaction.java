package student_sergei_klunkov.lesson_8.level_1;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount){

        this.trader = trader;
        this.amount = amount;

    }

    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getAmount() {
        return this.amount;
    }
}
