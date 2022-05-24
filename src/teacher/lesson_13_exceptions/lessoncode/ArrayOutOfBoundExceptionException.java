package teacher.lesson_13_exceptions.lessoncode;

import student_alina_strumpe._lesson_2_level_2_intern_Task_3.Book;

public class ArrayOutOfBoundExceptionException {

	public static void main(String[] args) {
		try {
			System.out.println("Main before");
			m1();
			System.out.println("Main after");
		} finally {
			System.out.println("FINALLY!!!");
		}

		System.out.println("PROGRAM FINISH!");
	}

	public static void m1() {
		System.out.println("M1 before");
		m2();
		System.out.println("M1 after");
	}

	public static void m2() {
		System.out.println("M2 before");
		m3();
		System.out.println("M2 after");
	}

	public static void m3() {
		Book book = new Book();
		System.out.println("M3");

		//ArrayOutOfBoundExceptionExceptionV2.m3();
	}
}
