package student_yevgeniy_tolks.lesson_7.level_6.task10;

import java.util.Scanner;

public class CreditCardDemo {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(1234123412341234L, 1111,1400);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pin code: ");
        int enterPinCode = scanner.nextInt();
        while (true) {

            while (enterPinCode != creditCard.getPinCode()) {
                System.out.println("WRONG PIN, TRY AGAIN: ");
                enterPinCode = scanner.nextInt();
            }
            System.out.println("Choose operation");
            System.out.println("1 - Money amount to deposit");
            System.out.println("2 - Money amount to withdraw");
            System.out.println("3 - Check account balance");
            System.out.println("4 - Exit");
            int chooseDepositOrWithdrawal = scanner.nextInt();
            switch (chooseDepositOrWithdrawal) {
                case 1:
                    System.out.println("Enter money amount to deposit: ");
                    double moneyAmountToDeposit = scanner.nextDouble();
                    creditCard.setMoneyAmount(moneyAmountToDeposit);
                    if (creditCard.depositMoney()) {
                        System.out.println("Money added to account");
                    }
                    break;
                case 2:
                    System.out.println("Enter money amount to withdraw: ");
                    double moneyAmountToWithdraw = scanner.nextDouble();
                    creditCard.setMoneyAmount(moneyAmountToWithdraw);
                    if (creditCard.withdrawMoney()) {
                        System.out.println("Money withdrawed from account");
                    }
                    else {
                        System.out.println("Not enough money on account");
                    }
                    break;
                case 3:
                    creditCard.printBalanceOnConsole();
                    break;
                case 4:
                    break;
            }
        }
    }
}

