package student_stanislav_astafjev.lesson_8.task_1;

class Trader {
    private String fullName;
    private String city;

    public Trader(String fullName,String city) {
        this.fullName = fullName;
        this.city = city;

    }
    @Override
    public String toString() {
        return "Trader{" +
                "fullName'" + fullName + "\'" +
                ", city='" + city + "\'" +
                "}";
    }
    public String getFullName() {
        return this.fullName;
    }

    public String getCity() {
        return this.city;
    }
}
