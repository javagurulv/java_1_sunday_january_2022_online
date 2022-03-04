package student_yevgeniy_tolks.lesson_3.level_7;

import java.util.Scanner;

 class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("ASUS ZENBOOK");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter regular price of laptop: ");
        double priceOfProduct = scanner.nextDouble();
        product.productPrice(priceOfProduct);

        System.out.print("Enter discount value on laptop: ");
        double discountValue=scanner.nextDouble();
        product.discountOnProduct(discountValue);

        product.actualPrice();
        product.printInformation();

    }
}
