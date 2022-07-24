package student_stanislav_astafjev.lesson_8.task_1;

class Trader {
    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName,String city,String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;

    }
    @Override
    public String toString() {
        return "Trader{" +
                "fullName'" + fullName + "\'" +
                ", city='" + city + "\'" +
                ", country='" + country + '\'' +
                "}";
    }
    public String getFullName() {
        return this.fullName;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }
}
