package student_devids_kropacovs.lesson8.level1;


class Trader {

    private String fullName;
    private String city;
    private  String country;
    Trader (String fullName, String city, String country){
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName(){
        return this.fullName;
    }

    public String getCity(){
        return this.city;
    }

    public  String getCountry(){
        return this.country;
    }
}
