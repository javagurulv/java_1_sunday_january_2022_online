package teacher.lesson_5_arrays_for_loop.lessoncode;

class AverageMarkV2 {

	public double calculate(int[] marks) {
		int markSum = calculateMarksSum(marks);
		return  (double) markSum / marks.length;
	}

	private int calculateMarksSum(int[] marks) {
		int markSum = 0;
		for (int i = 0; i < marks.length; i++) {
			markSum = markSum + marks[i];
		}
		return markSum;
	}

}
