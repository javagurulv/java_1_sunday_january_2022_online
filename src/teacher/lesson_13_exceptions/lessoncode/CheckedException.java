package teacher.lesson_13_exceptions.lessoncode;

public class CheckedException {

	public static void main(String[] args) {
		//try {
			m();
		//} catch (ClientNotFoundException e) {

		//}
	}

	private static void m() {
		throw new ClientNotFoundException(1L);
	}

}
