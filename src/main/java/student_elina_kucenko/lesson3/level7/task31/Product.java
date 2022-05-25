package student_elina_kucenko.lesson3.level7.task31;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Расчет актуальной стоимости с учетом скидки (double actualPrice()).
    public double actualPrice() {
        return (regularPrice - (regularPrice * discount));
    }

    // Вывод информации о продукте в консоль (void printInformation()).
    public void printInformation() {
        System.out.println(name + " regular price is " + regularPrice + " euro and price with discount is "+actualPrice()+ " euro.");
    }


}
