package student_devids_kropacovs.lesson7.task9;

import java.util.Scanner;

public class CreditCardDemo {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(234567, 1234);
        while(true){
            System.out.println("Please, choose an operation by entering a number of that operation.");
            System.out.println("Press 1 to see your balance.");
            System.out.println("Press 2 to see Credit that you need to pay.");
            System.out.println("Press 3 to make a deposit.");
            System.out.println("Press 4 to withdraw money.");
            System.out.println("Press 5 to unblock your card.");
            System.out.println("Press 6 to stop operations");
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();
            switch (operation){
                case 1: creditCard.printBalance();
                case 2: creditCard.printCreditToPay();
                case 3: creditCard.depositMoney();
                case 4: creditCard.withdrawMoney();
                case 5: creditCard.unblockCard();
                case 6: break;
            }
        }
    }


}
