package student_vitaly_galuzo.lesson_4.level_6;

public class Stock {

    String company;
    int currentPrice;
    int maxPrice;
    int minPrice;





    public Stock(String company, int currentPrice){
        this.company = company;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;

    }

    public int updatePrice(int newPrice){
        if(newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        if(newPrice < minPrice) {
            minPrice = newPrice;
        }
        return currentPrice = newPrice;
    }

    public String getPriceInformation(){
        return "Company name = "+ this.company + ", Current price = "+ this.currentPrice + ", Min price = "+ this.minPrice + ", Max price = " + this.maxPrice;

    }

}
