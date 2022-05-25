package teacher.lesson_7_encapsulation.lessoncode;

class Wallet {

	private int money;
	private int password;

	public Wallet(int password) {
		this.money = 0;
		this.password = password;
	}

	public boolean addMoney(int moneyToAdd, int password) {
		if (this.password == password) {
			this.money = this.money + moneyToAdd;
			return true;
		} else {
			return false;
		}
	}

	public boolean getMoney(int moneyToGet, int password) {
		if ((this.password == password) && (this.money >= moneyToGet)) {
			this.money = this.money - moneyToGet;
			return true;
		} else {
			return false;
		}
	}

	public int getBalance(int password) {
		if (this.password == password) {
			return this.money;
		} else {
			return -1;
		}
	}

}
