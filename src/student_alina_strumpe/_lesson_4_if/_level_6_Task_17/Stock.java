package student_alina_strumpe._lesson_4_if._level_6_Task_17;

import java.util.Date;

class Stock {

    Date date = new Date();
    public String companyName;
    public double currentValue;
    public double minValue;
    public double maxValue;


    public Stock(String companyName, double currentValue, double minValue, double maxValue) {
        this.companyName = companyName;
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;

    }


    public double upDatePrice(double newValue) {
        currentValue = newValue;
        if (newValue < minValue) {
            minValue = newValue;
        } else if (newValue > maxValue) {
            maxValue = newValue;

        }
        return newValue;
    }

     public void getPriceInformation(){
         System.out.println("Company name: "+ companyName + "\n" + "Stock price: " + currentValue + "\n" + "Max value: "
                 + maxValue + "\n" + "Min value: "+ minValue + "\n" + date);

     }

}


//
//    Необходимо реализовать класс Stock ("акция") таким образом,
//    чтобы была возможность узнать текущую цену акции,
//        а также ее максимальную и минимальную стоимость
//        за период существования.
//
//        Класс Stock должен обладать следующими характеристиками:
//
//        Свойства:
//        - Имя компании
//        - Текущая стоимость
//        - Минимальная стоимость
//        - Максимальная стоимость
//
//        Методы:
//        - Обновить текущую стоимость акции updatePrice()
//        - Получить информацию об акции getPriceInformation()
//
//        Имя компании и начальную стоимость необходимо
//        задавать в момент создания акции.
//        Текущая, минимальная и максимальная стоимость
//        должны меняться только через метод updatePrice().
//
//        Написать тестовые сценарии для класса Stock в классе StockTest.
