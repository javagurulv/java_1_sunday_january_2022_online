package teacher.lesson_8_single_responsibility_principle.lessoncode.methodversion;

import java.util.Scanner;

class HumanPlayer implements Player {

	private String name;
	private int symbol;

	public HumanPlayer(String name, int symbol) {
		this.name = name;
		this.symbol = symbol;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSymbol() {
		return symbol;
	}

	@Override
	public Move getMove(Board board) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter coordinate X [entry range 0-2]");
		int getX = scanner.nextInt();
		while (getX > 3) {
			System.out.println("Wrong input of X");
			System.out.println("Please enter coordinate X [entry range 0-2]");
			getX = scanner.nextInt();
		}

		System.out.println("Please enter coordinate Y [entry range 0-2]");
		int getY = scanner.nextInt();
		while (getY > 3) {
			System.out.println("Wrong input of Y");
			System.out.println("Please enter coordinate Y [entry range 0-2]");
			getY = scanner.nextInt();
		}

		return new Move(getX, getY, this);
	}

}
