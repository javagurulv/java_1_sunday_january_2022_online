package student_devids_kropacovs.lesson7.task9;

import java.util.Scanner;

public class CreditCard {

    private int cardNumber;
    private int pinCode;
    private double balance;
    private int creditLimit;
    private double creditToPay;
    private boolean cardIsBlocked;

    public CreditCard(int cardNumber, int pinCode){
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditToPay = 0;
        this.creditLimit = 100;
        this.cardIsBlocked = false;
    }
/*
Требования к зачислению средств:
- При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
- Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
- В первую очередь зачисление покрывает задолженность по кредиту;
- Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;

 */

    public boolean enterPin(){
        System.out.print("Please enter a Pin Code of your card: ");
        Scanner scanner = new Scanner(System.in);
        int pinCode = scanner.nextInt();
        for (int i = 0; i < 3; i++){
            if(pinCode == this.pinCode){
                return true;
            }else{
                System.out.println("You have entered wrong pin, try again. Attempts left: " + (2-1));
                System.out.print("Please enter a Pin Code of your card: ");
                pinCode = scanner.nextInt();
            }
        }
        System.out.println("Your card is blocked");
        this.cardIsBlocked = true;
        return false;
    }

    public void printBalance(){
        System.out.println("Your balance is: " + this.balance);
    }

    public void printCreditToPay(){
        System.out.println("Your Credit that needs to be payed is: " + this.creditToPay);
    }


    public double depositMoney(){
        boolean pinCode = enterPin();
        if (pinCode == false || this.cardIsBlocked == true){
            System.out.println("Your card is currently blocked, operations are not possible.");
            return 0;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much would you like to deposit ?");
        double deposit = scanner.nextDouble();
        if(deposit >= this.creditToPay){
            this.creditToPay = 0;
            deposit = deposit - this.creditToPay;
            this.balance = this.balance + deposit;
            return deposit;
        }else{
            this.creditToPay = this.creditToPay - deposit;
            return deposit;
        }
    }

    public double withdrawMoney(){
        boolean pinCode = enterPin();
        if (pinCode == false || this.cardIsBlocked == true){
            System.out.println("Your card is currently blocked, operations are not possible.");
            return 0;
        }
        Scanner scanner = new Scanner(System.in);
        if(this.balance <=0){
            System.out.println("You do not have money to withdraw.");
            return 0;
        }
        System.out.println("How much would you like to withdraw?");
        double withdraw = scanner.nextDouble();
        if (withdraw > this.balance + (creditLimit - creditToPay)){
            System.out.println("You cannot withdraw that much");
            return 0;
        }else{
            if(withdraw >= balance){
                this.creditToPay = this.creditToPay + this.balance - withdraw;
                this.balance = 0;
            }else{
                this.balance = this.balance - withdraw;
            }
            return  withdraw;
        }
    }

}
/*
 boolean pinCode = enterPin();
        if (pinCode == false || this.cardIsBlocked == true){
            System.out.println("Your card is currently blocked, operations are not possible.");
            return 0;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much would you like to deposit ?");
        double deposit = scanner.nextInt();
        if(deposit >= this.creditToPay){
            this.creditToPay = 0;
            deposit = deposit - this.creditToPay;
            double balance = this.balance + deposit;
            return balance;
        }else{
            this.creditToPay = this.creditToPay - deposit;
        }



        System.out.print("Your credit limit is now");
        return balance;
    }
 */