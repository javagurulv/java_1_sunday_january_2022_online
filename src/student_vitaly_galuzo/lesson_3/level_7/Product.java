package student_vitaly_galuzo.lesson_3.level_7;

public class Product {


        String name;
        double regularPrice;
        double discount;

        //1. Расчет актуальной стоимости с учетом скидки (double actualPrice()).
            //2. Вывод информации о продукте в консоль (void printInformation()).
            //3. Название продукта нужно задавать через конструктор.
           // 4. Стоимость и скидку нужно задавать через соответствующие методы.


        Product(String name, double regularPrice, double discount){
            this.name = name;
            this.regularPrice = regularPrice;
            this.discount = discount;

        }

        public String printInformation(){
            this.name = name;
            return name;


        }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscount(){
            return discount;

    }
    public double actualPrice(double price){
          price = regularPrice - (regularPrice * discount/100);
          return price;

    }






}
