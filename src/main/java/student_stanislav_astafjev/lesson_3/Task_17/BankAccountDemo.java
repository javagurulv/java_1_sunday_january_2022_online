package student_stanislav_astafjev.lesson_3.Task_17;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor","Savonin",100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerSecondName = bankAccount.getOwnerSecondName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner second name = " + ownerSecondName);
        System.out.println("Money amount = " + moneyAmount);
    }
}
