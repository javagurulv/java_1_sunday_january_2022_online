package student_aleksandra_jefimova.lesson_3.level_7.task_31;

class Product {
    String name;
    double regularPrice;
    double discount;

    public Product (String name) {
        this.name = name;
        this.discount = 0;
        this.regularPrice = 0;

    }
    void actualPrice (double price, double discount) {
        this.regularPrice = price - (price * discount / 100);
    }
    void printInformation(){
        System.out.println("Price is " + regularPrice);
        }
    }
