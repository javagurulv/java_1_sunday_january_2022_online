package student_stanislav_astafjev.lesson_5.lesson;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor");

        Transaction[] transactions = new Transaction[4];
        transactions[0] = new Transaction(true,100);
        transactions[1] = new Transaction(false,90);
        transactions[2] = new Transaction(true,1000);
        transactions[3] = new Transaction(false,100);

        /*bankAccount.executeTransaction(transaction[0]);
        bankAccount.executeTransaction(transaction[1]);
        bankAccount.executeTransaction(transaction[2]);
        bankAccount.executeTransaction(transaction[3]);
*/
        for(int i = 0; i < transactions.length; i++) {
            Transaction transaction = transactions[i];
            bankAccount.executeTransaction(transaction);
        }

        System.out.println("Money = " + bankAccount.getMoney());

    }
}
