package student_elina_kucenko.lesson4.level6;

class Stock {
    String company;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void updatePrice(int newCurrentPrice) {
        currentPrice = newCurrentPrice;
        if (newCurrentPrice > maxPrice) {
            this.maxPrice = newCurrentPrice;
        }
        if (newCurrentPrice < minPrice) {
            this.minPrice = newCurrentPrice;
        }
    }

    public String getPriceInformation() {
        return "Company " + company + ". Minimal price is " + minPrice + ". Maximal price is " + maxPrice + ". Current price is " + currentPrice + ".";
    }
}