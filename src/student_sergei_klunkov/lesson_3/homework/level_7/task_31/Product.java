package student_sergei_klunkov.lesson_3.homework.level_7.task_31;

public class Product {

    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name, double regularPrice, double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;

    }

    double actualPrice() {
        this.regularPrice = this.regularPrice - (this.regularPrice*discount/100);

        return this.regularPrice;

    }
    void printInformation(){
        System.out.println("The actual price is " + regularPrice );

    }

}