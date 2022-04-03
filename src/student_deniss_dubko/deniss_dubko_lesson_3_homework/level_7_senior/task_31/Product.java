package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_7_senior.task_31;

class Product {

    private String productName;
    private double regularPrice;
    private double discount;

    public Product(String productName,
                   double regularPrice,
                   double discount) {

        this.productName = productName;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public double actualPrice() {

        double actualPrice = (regularPrice - (regularPrice * discount / 100));

        return actualPrice;
    }

    public void printInformation() {

        System.out.println("Product Name: " + this.productName);
        System.out.println("Regular Product Price: " + this.regularPrice);
        System.out.println("Discount: " + this.discount);
        System.out.println("Actual Product Price: " + actualPrice());
    }

}
