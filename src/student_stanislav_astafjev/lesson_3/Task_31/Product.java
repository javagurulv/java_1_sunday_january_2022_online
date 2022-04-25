package student_stanislav_astafjev.lesson_3.Task_31;

class Product {
    String name;
    double regularPrice;
    double discount;
    Product(String name,double regularPrice,double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }
    public String printInfo(){
        this.name = name;
        return name;
    }
    public double getRegularPrice(){
        return regularPrice;
    }
    public double getDiscount(){
        return discount;
    }
    public double actualPrice(double price){
        price = regularPrice = (regularPrice * discount/100);
        return price;
    }
}
