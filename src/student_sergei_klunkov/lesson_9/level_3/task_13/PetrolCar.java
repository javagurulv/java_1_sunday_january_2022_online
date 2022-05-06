package student_sergei_klunkov.lesson_9.level_3.task_13;

class PetrolCar extends Car {

    private double petrolTankCapacity;

    public void setPetrolTankCapacity(double petrolTankCapacity) {
        this.petrolTankCapacity = petrolTankCapacity;
    }

    public double getPetrolTankCapacity() {
        return petrolTankCapacity;
    }

    @Override
    void accelerate() {
    }
}
