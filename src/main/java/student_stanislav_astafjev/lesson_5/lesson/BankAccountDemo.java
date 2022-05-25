package student_stanislav_astafjev.lesson_5.lesson;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor");

        Transaction[] transaction = new Transaction[4];
        transaction[0] = new Transaction(true,100);
        transaction[1] = new Transaction(false,90);
        transaction[2] = new Transaction(true,1000);
        transaction[3] = new Transaction(false,100);

        bankAccount.executeTransaction(transaction[0]);
        bankAccount.executeTransaction(transaction[1]);
        bankAccount.executeTransaction(transaction[2]);
        bankAccount.executeTransaction(transaction[3]);


        System.out.println("Money = " + bankAccount.getMoney());

    }
}
