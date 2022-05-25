package student_vitaly_galuzo.lesson_5.level_2;

public class Task12 {

    public static void main(String[] args) {
		ArrayService arrayService = new ArrayService();
		int[] numbers = arrayService.createArray(3);
		arrayService.fillArrayWithRandomNumbers(numbers);
		arrayService.printArrayToConsole(numbers);
	}

}