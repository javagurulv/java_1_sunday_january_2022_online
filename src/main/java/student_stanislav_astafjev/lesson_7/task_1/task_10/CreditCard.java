package student_stanislav_astafjev.lesson_7.task_1.task_10;


public class CreditCard {
    private String holderName;
    private String cardName;
    private int cardNumber;
    private int accountBalance;
    private int cardCode;
    private int creditLimit;
    private int loanDebt;


    public CreditCard() {
        cardNumber = 789456;
        cardCode = 1992;
        accountBalance = 133;
    }

    public CreditCard(String name, int card, int balance,int limit,int debt) {
        holderName = name;
        cardNumber = card;
        accountBalance = balance;
        creditLimit = limit;
        loanDebt = debt;
    }
    public String getHolderName() {
        return holderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getLoanDebt() {
        return loanDebt;
    }
    public void setCardNumber(int c) {

        System.out.println("Enter card number: ");

        CharSequence cardNum = null;
        if (cardNum.length() >= 13 && cardNum.length() <= 16){
            System.out.println("Valid card number ");
            cardNumber = c;
        } else {
            System.out.println("Error: Invalid card number");
        }
    }


}
