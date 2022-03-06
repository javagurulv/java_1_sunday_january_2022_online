package teacher.lesson_3_oop_first_look.lessoncode;

public class DogDemo {

	public static void main(String[] args) {
		Dog sharik = new Dog("Sharik", 10);
		Dog pupsik = new Dog("Pupsik", 9);

		sharik.voice();
		sharik.voice();
		sharik.voice();

		pupsik.voice();
		pupsik.voice();
		pupsik.voice();

		sharik.voiceYourName();
		pupsik.voiceYourName();

	}

}
