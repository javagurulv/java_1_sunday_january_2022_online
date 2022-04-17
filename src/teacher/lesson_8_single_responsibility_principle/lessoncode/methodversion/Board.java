package teacher.lesson_8_single_responsibility_principle.lessoncode.methodversion;

import java.util.Arrays;

class Board {

	private int[][] field;

	public Board() {
		this.field = createField();
	}

	private int[][] createField() {
		int[][] field = new int[3][3];
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field.length; j++) {
				field[i][j] = -1;
			}
		}
		return field;
	}

	public int getCellState(int x, int y) {
		return field[x][y];
	}

	public void doMove(Move move) {
		Player player = move.getPlayer();
		field[move.getX()][move.getY()] = player.getSymbol();
	}

	public void printFieldToConsole() {
		System.out.println("Your field is " + Arrays.deepToString(field));
	}

	public boolean isWinPosition(int playerToCheck) {
		return isWinPositionForDiagonals(playerToCheck)
				|| isWinPositionForVerticals(playerToCheck)
				|| isWinPositionForHorizontals(playerToCheck);
	}

	private boolean isWinPositionForHorizontals(int playerToCheck) {
		if (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck) {
			return true;
		} else if (field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck) {
			return true;
		} else if (field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck) {
			return true;
		}
		return false;
	}

	private boolean isWinPositionForVerticals(int playerToCheck) {
		if (field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck) {
			return true;
		} else if (field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck) {
			return true;
		} else if (field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck) {
			return true;
		}
		return false;
	}

	private boolean isWinPositionForDiagonals(int playerToCheck) {
		if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
			return true;
		} else if (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck) {
			return true;
		}
		return false;
	}

	public boolean isDrawPosition() {
		if (!isWinPosition(1)
				&& !isWinPosition(0)
				&& hasNoEmptyField()) {
			return true;
		}
		return false;
	}

	private boolean hasNoEmptyField() {
		for (int[] inField : field) {
			int notZero = -1;
			for (int number : inField) {
				if (notZero == number) {
					return false;
				}
			}
		}
		return true;
	}

}

