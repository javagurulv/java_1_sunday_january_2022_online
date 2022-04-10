package student_elina_kucenko.lesson7.level6;

public class CredCardTest {


    public static void main(String[] args) {
        CredCardTest credCardTest = new CredCardTest();
        credCardTest.withdrawalMoreThanBalanceAndCredLimit();
        credCardTest.withdrawalMoreThanBalanceAndLessThanCredLimit();
        credCardTest.withdrawalLessThanBalance();
        credCardTest.withdrawalLessThanBalancePinCodeCheck();
        credCardTest.withdrawalMoreThanBalanceAndLessThanCredLimitPinCodeCheck();

        credCardTest.depositLessThanCredit();
        credCardTest.depositMoreThanCredit();
        credCardTest.depositLessThanCreditPinCodeCheck();
        credCardTest.depositMoreThanCreditPinCodeCheck();
    }

    public void withdrawalMoreThanBalanceAndCredLimit() {
        CredCard credCard = new CredCard("555 555 555", "0000");
        credCard.setCreditLimit(5);
        credCard.setBalance(20);
        if (!credCard.withdrawMoney(35, "0000") && credCard.getBalance() == 20 && credCard.getCreditDebt() == 0) {
            System.out.println("Withdrawal more than Balance and Credit limit Test- OK");
        } else {
            System.out.println("Withdrawal more than Balance and Credit limit Test - Failed");
        }
    }

    public void withdrawalMoreThanBalanceAndLessThanCredLimit() {
        CredCard credCard = new CredCard("555 555 555", "0000");
        credCard.setBalance(20);
        credCard.setCreditLimit(5);
        if (credCard.withdrawMoney(25, "0000") && credCard.getBalance() == 0 && credCard.getCreditDebt() == 5) {
            System.out.println("Withdrawal more than balance and less than Credit limit Test - OK");
        } else {
            System.out.println("Withdrawal more than balance and less than Credit limit Test - Failed");
        }
    }

    public void withdrawalLessThanBalance() {
        CredCard credCard = new CredCard("555 555 555", "0000");
        credCard.setBalance(20);
        if (credCard.withdrawMoney(15, "0000") && credCard.getBalance() == 5 && credCard.getCreditDebt() == 0) {
            System.out.println("Withdrawal less than Balance Test - OK");
        } else {
            System.out.println("Withdrawal less than Balance Test - Failed");
        }
    }

    public void withdrawalLessThanBalancePinCodeCheck() {
        CredCard credCard = new CredCard("555 555 555", "0000");
        credCard.setBalance(20);
        if (!credCard.withdrawMoney(15, "000") && credCard.getBalance() == 20 && credCard.getCreditDebt() == 0) {
            System.out.println("PinCode check for Withdrawal less than Balance Test - OK");
        } else {
            System.out.println("PinCode check for Withdrawal less than Balance Test - Failed");
        }
    }

    public void withdrawalMoreThanBalanceAndLessThanCredLimitPinCodeCheck() {
        CredCard credCard = new CredCard("555 555 555", "0000");
        credCard.setBalance(20);
        if (!credCard.withdrawMoney(25, "0050") && credCard.getBalance() == 20 && credCard.getCreditDebt() == 0) {
            System.out.println("PinCode check for Withdrawal more than Balance and less than Credit limit Test - OK");
        } else {
            System.out.println("PinCode check for Withdrawal more than Balance and less than Credit limit Test - Failed");
        }
    }

    public void depositLessThanCredit() {
        CredCard credCard = new CredCard("555 555 555", "0000");
        credCard.setCreditDebt(20);
        credCard.setBalance(0);
        if (credCard.depositMoney(10, "0000") && credCard.getCreditDebt() == 10 && credCard.getBalance() == 0) {
            System.out.println("Deposit less than Credit Test-OK");
        } else {
            System.out.println("Deposit less than Credit Test-Failed");
        }
    }

    public void depositMoreThanCredit() {
        CredCard credCard = new CredCard("555 555 555", "0000");
        credCard.setCreditDebt(20);
        credCard.setBalance(0);
        if (credCard.depositMoney(21, "0000") && credCard.getCreditDebt() == 0 && credCard.getBalance() == 1) {
            System.out.println("Deposit more than Credit Test -OK");
        } else {
            System.out.println("Deposit more than Credit Test -Failed");
        }
    }


    public void depositLessThanCreditPinCodeCheck() {
        CredCard credCard = new CredCard("555 555 555", "0000");
        credCard.setCreditDebt(20);
        if (!credCard.depositMoney(10, "0050") && credCard.getCreditDebt() == 20 && credCard.getBalance() == 0) {
            System.out.println("PinCode check for Deposit less than Credit Test - OK");
        } else {
            System.out.println("PinCode check for Deposit less than Credit Test - Failed");
        }
    }

    public void depositMoreThanCreditPinCodeCheck() {
        CredCard credCard = new CredCard("555 555 555", "0000");
        credCard.setCreditDebt(20);
        if (!credCard.depositMoney(21, "0010") && credCard.getCreditDebt() == 20 && credCard.getBalance() == 0) {
            System.out.println("PinCode check for Deposit more than Credit Test - OK");
        } else {
            System.out.println("PinCode check for Deposit more than Credit Test -Failed");
        }
    }
}
