package student_vitaly_galuzo.lesson_5.level_2;

import java.util.Random;

class ArrayService {

	public int[] createArray(int length) {
		return new int[length];
	}

	public void fillArray(int[] array) {
		array[0] = 1;
		array[1] = 3;
		array[2] = 5;
	}

	public void printArrayToConsole(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	public void fillArrayWithRandomNumbers(int[] numbers) {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(101);
		}
	}

	public void fillArrayWithRandomNumbers(int[] numbers, int bound) {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(bound);
		}
	}

}
