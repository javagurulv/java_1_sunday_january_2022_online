package student_stanislav_astafjev.lesson_4.Task_17;

class Stock {
    private final String company;
    public int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public int updatePrice(int newPrice) {
        if (maxPrice > currentPrice && minPrice < currentPrice) {
            this.currentPrice = newPrice;
        } else if (newPrice > currentPrice) {
            this.maxPrice = newPrice;
        } else if (newPrice < currentPrice) {
            this.minPrice = newPrice;
        }
        return newPrice;
    }

    public String getPriceInformation() {
        return "Company" + this.company + ", Current Price " + this.currentPrice + ", Min price " + this.minPrice + ", Max Price " + this.maxPrice;
    }
}
