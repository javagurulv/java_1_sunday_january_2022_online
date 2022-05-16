package student_stanislav_astafjev.lesson_5.lesson;

class Transaction {

    private boolean incoming;

    private int money;

    public Transaction(boolean incoming,int money) {
        this.incoming = incoming;
        this.money = money;
    }
    public boolean isIncoming() {
        return incoming;
    }
    public int getMoney(){
        return money;
    }

}
