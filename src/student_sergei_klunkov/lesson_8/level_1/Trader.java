package student_sergei_klunkov.lesson_8.level_1;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country){

        this.fullName = fullName;
        this.city = city;
        this.country = country;

    }

    public String toString() {
        return "Trader{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() { return  this.country; }
}


