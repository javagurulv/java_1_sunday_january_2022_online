package student_yevgeniy_tolks.lesson_8.level_1_to_6;

class Trader {

    private String fullName;
    private String country;
    private String city;

    public Trader(String fullName, String city,String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getCity() {
        return this.city;
    }
}
