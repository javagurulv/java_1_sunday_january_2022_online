package teacher.lesson_6_arrays_while_loop.lessoncode;

class Robot {

	private String name;

	public Robot(String robotName) {
		this.name = robotName;
	}

	public String sayHello() {
		return "Hello!";
	}

	public int[] createArray(int arraySize) {
		return new int[arraySize];
	}

	public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
		return Math.max(firstNumber, secondNumber);
	}

	public int maxOfTwoNumbersV2(int firstNumber,
								 int secondNumber) {
		if (firstNumber > secondNumber) {
			return firstNumber;
		} else {
			return secondNumber;
		}
	}

	public int maxOfThreeNumbers(int firstNumber,
								 int secondNumber,
								 int thirdNumber) {
		int max = maxOfTwoNumbersV2(firstNumber, secondNumber);
		return maxOfTwoNumbersV2(max, thirdNumber);
	}

}
