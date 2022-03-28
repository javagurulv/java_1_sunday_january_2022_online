package student_alina_strumpe._lesson_4_if._level_6_Task_17;

import java.util.Date;

class Stock {

    Date date = new Date();
    private String companyName;
    private double currentValue;
    private double minValue;
    private double maxValue;
    private double newValue;
    private String stockValueInfo;


    public Stock(String companyName, double currentValue, double minValue, double maxValue) {
        this.companyName = companyName;
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;

    }

    public void upDateCurrentValue(double currentValue) {
        if (currentValue == currentValue);
            this.currentValue = currentValue;
        }
    public void upDateMinValue(double minValue){
            if (newValue < minValue);
                this.minValue = minValue;
            }
        public void upDateMaxValue(double maxValue) {
        if (newValue > maxValue);
            this.maxValue = maxValue;
        }

    public String getCompanyName(String companyName) {return companyName;}
    public double getCurrentValue(double currentValue) {return currentValue;}
    public double getMinValue(double minValue) {return minValue;}
    public double getMaxValue(double maxValue) {return maxValue;}


        public String printValueInformation(){
        return stockValueInfo = "Company: " + companyName + " Current value of the stock - "+
                currentValue + ", Min stock value:  " + minValue + ", Max value: " + maxValue + " Date: "+ date;
        }
         /*System.out.println("Company name: "+ companyName + "\n" + "Stock price: " + currentValue + "\n" + "Max value: "
                 + maxValue + "\n" + "Min value: "+ minValue + "\n" + date);*/

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
