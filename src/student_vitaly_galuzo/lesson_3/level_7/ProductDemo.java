package student_vitaly_galuzo.lesson_3.level_7;

 class ProductDemo {

    public static void main(String[] args) {

       Product product = new Product("Graphic card Nvidia RTX 3060TI",850,15);

       String productName = product.name;
       System.out.println(productName);
       double priceRegular = product.getRegularPrice();
       System.out.println("Regular price is "+priceRegular+" Eur");
       double productDiscount = product.getDiscount();
        System.out.println("Discount is "+productDiscount+" %");
        double price = product.actualPrice(850);
        System.out.println("Actual product price is "+price+" Eur");




















       }





    }





