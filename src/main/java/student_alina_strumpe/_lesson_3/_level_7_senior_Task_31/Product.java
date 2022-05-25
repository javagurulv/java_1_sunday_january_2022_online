package student_alina_strumpe._lesson_3._level_7_senior_Task_31;

public class Product {

    public String prName;
    public double regularPrice;
    public double discount;
    public double actualPrice;

    public Product(String prName, double regularPrice, double discount){
        this.prName = prName;
        this.regularPrice = regularPrice;
        this.discount = discount;

            }
             public double calculateActPrice(){
        return actualPrice = regularPrice - (regularPrice / 100 / discount);}


    }






//    Разработать класс - продукт,
//        у которого должны быть следующие характеристики:
//
//        Свойства:
//        - Наименование (String name)
//        - Стандартная цена (double regularPrice)
//        - Скидка в процентах (double discount)
//
//        Методы:
//        1. Расчет актуальной стоимости с учетом скидки (double actualPrice()).
//        2. Вывод информации о продукте в консоль (void printInformation()).
//        3. Название продукта нужно задавать через конструктор.
//        4. Стоимость и скидку нужно задавать через соответствующие методы.