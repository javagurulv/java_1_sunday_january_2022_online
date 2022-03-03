package student_yevgeniy_tolks.lesson_3.level_7;

 class AnimalDemo {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Dog","Black",30);
        animal1.printStateOfAnimal();
        String moveOfAnimal= animal1.move("This animal is running!");
        System.out.println(moveOfAnimal);
        System.out.println();

        Animal animal2 = new Animal("Bird","Grey",2);
        animal2.printStateOfAnimal();
        String moveOfAnimal1=animal2.move("This is flying!");
        System.out.println(moveOfAnimal1);
        System.out.println();

        Animal animal3 = new Animal("Fish", "Blue",2000);
        animal3.printStateOfAnimal();
        String moveOfAnimal2=animal3.move("This is swimming!");
        System.out.println(moveOfAnimal2);

    }
}
