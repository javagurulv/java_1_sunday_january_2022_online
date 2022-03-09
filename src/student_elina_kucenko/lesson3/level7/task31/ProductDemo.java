package student_elina_kucenko.lesson3.level7.task31;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Apple");
        product.setRegularPrice(1.5);
        product.setDiscount(0.1);
        product.printInformation();
    }
}
