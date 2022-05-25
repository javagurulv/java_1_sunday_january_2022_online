package teacher.lesson_7_encapsulation.lessoncode;

class WalletDemo {

	public static void main(String[] args) {
		Wallet wallet = new Wallet(123);

		wallet.addMoney(10, 123);
		wallet.getMoney(5, 123);

/*
		wallet.money = 0;
		wallet.password = 1234;
*/

		int balance = wallet.getBalance(123);
		System.out.println("Balance = " + balance);

	}

}
