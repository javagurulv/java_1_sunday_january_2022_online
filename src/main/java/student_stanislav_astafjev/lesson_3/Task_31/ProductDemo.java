package student_stanislav_astafjev.lesson_3.Task_31;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Milk",1.5,25);
        String productname = product.name;
        double priceRegular = product.getRegularPrice();
        System.out.println("Regular " + productname + " price " + priceRegular + " Euro");
        double productDiscount = product.getDiscount();
        System.out.println("Discount " + productDiscount + " %");
        double price = product.actualPrice(1.5);
        System.out.println("Actual " + productname + " price " + price + " Euro");
    }
}
