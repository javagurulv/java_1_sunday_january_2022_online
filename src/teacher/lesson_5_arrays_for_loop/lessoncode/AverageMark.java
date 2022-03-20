package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Random;

class AverageMark {

	public double calculate(int markCount) {
		int[] marks = createMarkArray(markCount);
		generateRandomMarks(marks);
		printMarksToConsole(marks);
		return calculateMarksAverage(marks);
	}

	private double calculateMarksAverage(int[] marks) {
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

	private void printMarksToConsole(int[] marks) {
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Mark[" + i + "] = " + marks[i]);
		}
	}

	private void generateRandomMarks(int[] marks) {
		Random random = new Random();

		for (int i = 0; i < marks.length; i++) {
			int randomMark = random.nextInt(11) ;
			marks[i] = randomMark;
		}
	}

	private int[] createMarkArray(int marksCount) {
		return new int[marksCount];
	}

}
