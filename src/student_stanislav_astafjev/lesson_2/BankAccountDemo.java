package student_stanislav_astafjev.lesson_2;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor","Savonin", 1009);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);

    }
}
