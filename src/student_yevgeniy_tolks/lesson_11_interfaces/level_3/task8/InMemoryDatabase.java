package student_yevgeniy_tolks.lesson_11_interfaces.level_3.task8;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements ProductDataBase {

    protected List<Product> products = new ArrayList<>();

    @Override
    public String save(Product product) {
        products.add(product);
        return product.getTitle();
    }

    @Override
    public boolean findByTitle(String productTitle, Product product) {
        boolean findTitle = false;
        products.add(product);
        for (Product findProduct : products) {
            if (productTitle.equals(findProduct.getTitle())) {
                findTitle = true;
                break;
            }
        }
        return findTitle;
    }

    @Override
    public String toString() {
        return "InMemoryDatabase{" +
                "products=" + products.get(0) +
                '}';
    }
}