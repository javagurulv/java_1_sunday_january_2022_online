package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Random;

class ForArrayExample {

	public static void main(String[] args) {

		Random random = new Random();

		int[] randomNumbers = new int[10];

		for (int i = 0; i < randomNumbers.length; i++) {
			int randomNumber = random.nextInt(10000);
			randomNumbers[i] = randomNumber;
			//randomNumbers[0] = randomNumber;
			//randomNumbers[1] = randomNumber;
			//randomNumbers[2] = randomNumber;
			//randomNumbers[3] = randomNumber;
		}

		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.println(randomNumbers[i]);
			//System.out.println(randomNumbers[0]);
			//System.out.println(randomNumbers[1]);
			//System.out.println(randomNumbers[2]);
			//System.out.println(randomNumbers[3]);
		}

	}


}
