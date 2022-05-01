package student_stanislav_astafjev.lesson_4.Task_17;

class Stock {
    String company;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public int updatePrice(int newPrice) {
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }
        return currentPrice = newPrice;
    }

    public String getPriceInformation() {
        return "Company" + this.company + ", Current Price " + this.currentPrice + ", Min price " + this.minPrice + ", Max Price " + this.maxPrice;
    }

}
