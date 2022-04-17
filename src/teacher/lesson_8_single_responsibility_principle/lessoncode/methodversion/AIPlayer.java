package teacher.lesson_8_single_responsibility_principle.lessoncode.methodversion;

class AIPlayer implements Player {

	private String name;
	private int symbol;

	public AIPlayer(String name, int symbol) {
		this.name = name;
		this.symbol = symbol;
	}

	@Override
	public Move getMove(Board board) {

		int cellState = board.getCellState(1, 1);


		// AI algorithm
		return null;
	}

	@Override
	public int getSymbol() {
		return symbol;
	}

	@Override
	public String getName() {
		return name;
	}

}
