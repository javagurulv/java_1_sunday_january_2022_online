package student_devids_kropacovs.lesson8.level1to6;

class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount){
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader(){
        return this.trader;
    }

    public int getAmount(){
        return this.amount;
    }
}
