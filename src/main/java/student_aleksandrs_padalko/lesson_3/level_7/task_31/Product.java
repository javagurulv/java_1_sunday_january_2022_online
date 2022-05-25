package student_aleksandrs_padalko.lesson_3.level_7.task_31;

 class Product {String product;
    double price; double discount;

   public Product(String product, double price, double discount ) {
        this.product = product;
        this.price = price;
        this.discount = discount;
    }

    public Product(String product, String price, String discount) {
    }


    public String getProduct() { return this.product;
    }

    public double getPrice() {
         return this.price;
    }

    public double getDiscount() {
         return this.discount;
    }
}
