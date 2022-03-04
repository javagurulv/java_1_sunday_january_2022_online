package student_yevgeniy_tolks.lesson_3.level_7;

//Task29 - blueprint of Animal objects
 class Animal {

        private final String typeOfAnimal;
        private final String colorOfAnimal;
        private final int weightOfAnimal;

    public Animal(String typeOfAnimal,String colorOfAnimal,int weightOfAnimal){
        this.typeOfAnimal=typeOfAnimal;
        this.colorOfAnimal=colorOfAnimal;
        this.weightOfAnimal=weightOfAnimal;
    }

    public String move(String moveOfAnimal){
        return moveOfAnimal;
    }

    public void printStateOfAnimal(){
        System.out.println("Type of animal: " + typeOfAnimal);
        System.out.println("Color of animal: " + colorOfAnimal);
        System.out.println("Weight of animal: " + weightOfAnimal + " kg");
    }

}
