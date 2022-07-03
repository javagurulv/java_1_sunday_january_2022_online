package student_deniss_dubko.deniss_dubko_lesson_7_homework.level_6_middle;

import java.util.Scanner;

class CreditCardDemo {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(1111222233334444L, 1234);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PIN-code: ");
        short enterPinCode = scanner.nextShort();
        while (true) {
            while (enterPinCode != creditCard.getPinCode()) {
                System.out.println("Wrong PIN-code!");
                System.out.println("Enter PIN-code: ");
                enterPinCode = scanner.nextShort();
            }
            System.out.println("Choose operation: ");
            System.out.println("1 - Add Money");
            System.out.println("2 - Withdraw Money");
            System.out.println("3 - Check Balance");
            System.out.println("4 - Change Limit");
            System.out.println("5 - Exit");
            int chooseDepositOrWithdrawal = scanner.nextInt();
            switch (chooseDepositOrWithdrawal) {
                case 1:
                    Scanner scannerCase1 = new Scanner(System.in);
                    System.out.println("Enter PIN-code: ");
                    short enterPinCodeCase1 = scannerCase1.nextShort();
                    while (enterPinCodeCase1 != creditCard.getPinCode()) {
                        System.out.println("Wrong PIN-code!");
                        System.out.println("Enter PIN-code: ");
                        enterPinCodeCase1 = scanner.nextShort();
                    }
                    System.out.println("Enter Sum to Add: ");
                    double moneyAmountToDeposit = scanner.nextDouble();
                    creditCard.setMoneyAmount(moneyAmountToDeposit);
                    if (creditCard.depositMoney(creditCard.getPinCode(), moneyAmountToDeposit)) {
                        System.out.println(moneyAmountToDeposit + " added to Account");
                    }
                    if (creditCard.accountHasDebt(creditCard.getCreditLimit())) {
                        System.out.println("Account in Credit Limit");
                    } else if (creditCard.accountHasNoDebt()) {
                        System.out.println("Account out of Credit Limit");
                    }
                    break;
                case 2:
                    Scanner scannerCase2 = new Scanner(System.in);
                    System.out.println("Enter PIN-code: ");
                    short enterPinCodeCase2 = scannerCase2.nextShort();
                    while (enterPinCodeCase2 != creditCard.getPinCode()) {
                        System.out.println("Wrong PIN-code!");
                        System.out.println("Enter PIN-code: ");
                        enterPinCodeCase2 = scanner.nextShort();
                    }
                    System.out.println("Enter Sum to Withdraw: ");
                    double moneyAmountToWithdraw = scanner.nextDouble();
                    creditCard.setMoneyAmount(moneyAmountToWithdraw);

                    if (creditCard.withdrawMoney(creditCard.getPinCode(), moneyAmountToWithdraw, creditCard.getCreditLimit())) {
                        System.out.println(moneyAmountToWithdraw + " withdrawing from Account");
                    } else {
                        System.out.println("Not Enough Money");
                    }
                    if (creditCard.accountHasDebt(creditCard.getCreditLimit())) {
                        System.out.println("Account in Credit Limit");
                    } else if (creditCard.accountHasNoDebt()) {
                        System.out.println("Account out of Credit Limit");
                    }
                    break;
                case 3:
                    System.out.println("Balance: " + creditCard.printAccountBalanceOnConsole());
                    break;
                case 4:
                    System.out.println("Enter New Credit Limit: ");
                    double enterNewCreditLimitValue = scanner.nextDouble();
                    if (creditCard.cardIsCreated(creditCard)) {
                        creditCard.setCreditLimit(enterNewCreditLimitValue);
                        System.out.println("New Credit Limit: " + enterNewCreditLimitValue);
                    } else {
                        System.out.println("Card is not created");
                    }
                    break;
                case 5:
                    return;
            }
        }
    }

}