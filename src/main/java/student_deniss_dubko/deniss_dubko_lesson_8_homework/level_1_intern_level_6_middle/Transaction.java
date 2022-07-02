package student_deniss_dubko.deniss_dubko_lesson_8_homework.level_1_intern_level_6_middle;

public class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader,
                       int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getAmount() {
        return this.amount;
    }

}