package student_devids_kropacovs.lesson_4.level_6;

class Stock {

    String companyName;
    int stockPrice;
    int minStockPrice;
    int maxStockPrice;

    public Stock(String companyName, int initialStockPrice) {
        this.companyName = companyName;
        this.minStockPrice = initialStockPrice;
        this.maxStockPrice = initialStockPrice;
        this.stockPrice = initialStockPrice;
    }

    // initial 10, 5, 7 , 15 , 16, 12
    public int updatePrice(int updatedStockPrice) {
        if (updatedStockPrice < minStockPrice) {
            return this.minStockPrice = updatedStockPrice;
        }
        if (updatedStockPrice > maxStockPrice) {
            return this.maxStockPrice = updatedStockPrice;
        }

        return this.stockPrice = updatedStockPrice;
    }

    public void getPriceInformation() {
        System.out.println("Company = " + companyName + ", Current Price = " + stockPrice + ", Min Price = " + minStockPrice + ", Max Price = " + maxStockPrice);
    }

}
