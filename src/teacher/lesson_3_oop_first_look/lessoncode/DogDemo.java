package teacher.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

public class DogDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter dog name: ");
		String dogName = scanner.nextLine();
		System.out.println("Enter dog age: ");
		int dogAge = scanner.nextInt();

		Dog sharik = new Dog(dogName, dogAge);


		Dog pupsik = new Dog("Pupsik", 9);

		sharik.voice();
		sharik.voice();
		sharik.voice();

		pupsik.voice();
		pupsik.voice();
		pupsik.voice();

		sharik.voiceYourName();
		pupsik.voiceYourName();

		sharik.voiceYourAge();
		pupsik.voiceYourAge();


		sharik.voiceYourName();
		sharik.changeName("Mopsik");
		sharik.voiceYourName();

	}

}
