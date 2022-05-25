package student_sergei_klunkov.lesson_9.level_3.task_13;

class ElectricCar extends Car {

    private int batteryCharge;

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    @Override
    void accelerate() {

    }
}
