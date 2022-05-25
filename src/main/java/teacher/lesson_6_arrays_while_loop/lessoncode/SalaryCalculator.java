package teacher.lesson_6_arrays_while_loop.lessoncode;

class SalaryCalculator {

	public int calculateYearSalary(int[][] salaryTable) {
		int yearSalary = 0;
		for(int i = 0; i < salaryTable.length; i++) {
			for(int j = 0; j < salaryTable[i].length; j++) {
				yearSalary = yearSalary + salaryTable[i][j];
				System.out.println("[" + i + "," + j + "] = " + salaryTable[i][j]);
				System.out.println("Salary = " + yearSalary);
			}
		}
		return yearSalary;
	}

	public int calculateYearSalaryV2(int[][] salaryTable) {
		int yearSalary = 0;
		for(int i = 0; i < salaryTable.length; i++) {
			yearSalary = yearSalary + calculateYearSalaryForOnePerson(salaryTable, i);
		}
		return yearSalary;
	}

	private int calculateYearSalaryForOnePerson(int[][] salaryTable, int personIndex) {
		int personYearSalary = 0;
		for(int j = 0; j < salaryTable[personIndex].length; j++) {
			personYearSalary = personYearSalary + salaryTable[personIndex][j];
			System.out.println("[" + personIndex + "," + j + "] = " + salaryTable[personIndex][j]);
			System.out.println("Salary = " + personIndex);
		}
		System.out.println("PERSON [" + personIndex + "] Salary = " + personYearSalary);
		return personYearSalary;
	}


}
