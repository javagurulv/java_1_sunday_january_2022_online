package teacher.lesson_5_arrays_for_loop.lessoncode;


class AverageMarkV2Test {

	public static void main(String[] args) {
		AverageMarkV2Test averageMarkTest = new AverageMarkV2Test();
		averageMarkTest.test1();
	}

	// Test 1: marks[] = [1, 2, 3]
	public void test1() {
		AverageMarkV2 averageMark = new AverageMarkV2();
		int[] marks = {1, 2, 3};
		double actualResult = averageMark.calculate(marks);

		if (actualResult == 2) {
			System.out.println("TEST 1 = OK");
		} else {
			System.out.println("TEST 1 = FAIL");
		}
	}


}
