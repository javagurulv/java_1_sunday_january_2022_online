package student_devids_kropacovs.lesson8.level1;

import student_devids_kropacovs.lesson8.level1.Trader;

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
