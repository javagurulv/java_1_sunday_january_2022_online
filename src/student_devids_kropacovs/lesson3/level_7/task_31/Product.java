package student_devids_kropacovs.lesson3.level_7.task_31;

import java.util.Scanner;

class Product {
    String productName;
    double standartPrice;
    double discount;


    double actualPrice(double normalPrice , double discount){
/*        Scanner scannerPrice = new Scanner(System.in);
          Scanner scannerdisscount = new Scanner(System.in);
          System.out.print("What is the price of the product? ");

          normalPrice = scannerPrice.nextDouble();
          System.out.println();
          System.out.print("What is the discount in percent? ");
          discount = scannerdisscount.nextDouble();
    Возможно я не так понял задачу, сначала хотел сдлеать так, чтобы цену и скидку можно было вводит через консоль,
    как я понял, нужно, чтобы просто писали эти значени в скобках при вызоме метода.
 */
        this.standartPrice = normalPrice;
        this.discount = discount;
        return this.discount + this.standartPrice;
    }

    void printInformation(){
        double actualPrice;
        actualPrice = this.standartPrice * (1 - this.discount / 100);
        System.out.println("The actual price for " + productName + " is " + actualPrice);
    }

    public Product(String name){
        this.productName = name;
    }


}
