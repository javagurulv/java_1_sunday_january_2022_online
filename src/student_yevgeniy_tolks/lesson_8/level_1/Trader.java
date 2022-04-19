package student_yevgeniy_tolks.lesson_8.level_1;

class Trader {

    private String fullName;
    private String country;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }
    public Trader(String country){
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
