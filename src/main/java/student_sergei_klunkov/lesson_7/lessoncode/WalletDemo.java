package student_sergei_klunkov.lesson_7.lessoncode;

class WalletDemo {

    public static void main(String[] args) {
        Wallet wallet = new Wallet(123);

        wallet.addMoney(10, 123);
        wallet.getMoney(5, 123);

        int balance = wallet.checkBalance(123);
        System.out.println(" Balance = " + balance);
    }
}
