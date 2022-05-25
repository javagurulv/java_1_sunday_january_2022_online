package teacher.lesson_6_arrays_while_loop.lessoncode;

class SalaryDemo {

	public static void main(String[] args) {
		SalaryCalculator salaryCalculator = new SalaryCalculator();

		int[][] salary = {
				{1, 1, 1, 1},  // Vasja
				{2, 2, 2, 2},  // Petja
				{3, 3, 3, 3}   // Tanja
		};

		int yearSalary = salaryCalculator.calculateYearSalaryV2(salary);
		System.out.println("Year salary = " + yearSalary);


	}

}
