package student_yevgeniy_tolks.lesson_3.level_7;

 class Product {

    private final String name;
    double regularPrice;
    double discount;

        Product(String name) {
            this.name = name;
        }
        double productPrice(double price){
            this.regularPrice=price;
            return this.regularPrice;
        }

       double discountOnProduct(double discount){
            this.discount=discount;
            return this.discount;
        }
        double actualPrice(){
            this.regularPrice=this.regularPrice - (this.regularPrice * discount)/100;
            return this.regularPrice;
        }
        void printInformation(){
            System.out.println();
            System.out.println("Price of chosen product " + this.name + " " + String.format("%.2f",regularPrice) + "euro");
            System.out.println("Discount on chosen product was " + this.name + " " + discount + "%");
        }






}

