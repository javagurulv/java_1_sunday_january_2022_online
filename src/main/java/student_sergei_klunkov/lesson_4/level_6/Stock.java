package student_sergei_klunkov.lesson_4.level_6;


class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;

    }

    public int updatePrice(int newPrice){
        if (newPrice > maxPrice){
            maxPrice = newPrice;
        }
        if (newPrice < minPrice){
            minPrice = newPrice;
        }
        return currentPrice = newPrice;
    }

    public String getPriceInfo(){
        return  "Company name = " + companyName + ", Current price = "+ this.currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;

    }





}
