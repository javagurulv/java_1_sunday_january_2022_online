package student_alina_strumpe._lesson_3._level_2_intern._Task_17;

class BankAccountDemo {

    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount("Victor","Savonin",100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerSecondName = bankAccount.getOwnerSecondName();
        int moneyAmount = bankAccount.getMoneyAmount();

        System.out.println("Owner First Name:" + ownerFirstName);
        System.out.println("Owner Second Name:" + ownerSecondName);
        System.out.println("Money amount:" + moneyAmount);
    }
}
