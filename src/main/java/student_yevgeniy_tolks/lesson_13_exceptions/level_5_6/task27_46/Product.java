package student_yevgeniy_tolks.lesson_13_exceptions.level_5_6.task27_46;

import java.math.BigDecimal;
import java.util.Objects;

class Product {

    private String productTitle;
    private BigDecimal productPrice;
    private String productDescription;

    public Product(String productTitle, BigDecimal productPrice, String productDescription) {
        this.productTitle = productTitle;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productName) {
        this.productTitle = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(
                productTitle, product.productTitle)
                && Objects.equals(productPrice, product.productPrice)
                && Objects.equals(productDescription, product.productDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productTitle, productPrice, productDescription);
    }
}
