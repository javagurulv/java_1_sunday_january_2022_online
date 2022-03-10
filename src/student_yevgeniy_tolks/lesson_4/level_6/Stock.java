package student_yevgeniy_tolks.lesson_4.level_6;

class Stock {
    private final String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice=currentPrice;
        this.maxPrice=currentPrice;

    }

    public int updatePrice(int price) {

        if(maxPrice>currentPrice && minPrice<currentPrice){
            this.currentPrice=price;
        }
               else if(price>currentPrice ) {
                    this.maxPrice = price;
                }
                 else   if (price < currentPrice) {
                        this.minPrice = price;
                }
                        return price;

                }

        public String getPriceInformation () {

            return "Company name = " + this.companyName +
                    ", Current price = " + this.currentPrice +
                    ", Min price = " + this.minPrice +
                    ", Max price = " + this.maxPrice;
        }

    }

