package student_aleksandrs_padalko.lesson_3.level_7.task_31;


public class ProductDemo {public static void main(String[] args) {
    Product shirt = new Product("Shirt", 10, 20);
    String product = shirt.getProduct();
    double price = shirt.getPrice();
    double discount = shirt.getDiscount();
    double newPrice = shirt.getPrice() - (shirt.getPrice() * shirt.getDiscount()/100);

    System.out.println("Product = " + product);
    System.out.println("Price= " + price);
    System.out.println("Discount % = " + discount);
    System.out.println("New Price="+ newPrice);


}
}
