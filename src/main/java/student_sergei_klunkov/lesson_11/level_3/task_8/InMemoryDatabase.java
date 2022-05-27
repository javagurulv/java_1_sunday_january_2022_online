package student_sergei_klunkov.lesson_11.level_3.task_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {

    private List<Product> products = new ArrayList<>();
    private Product product;

    @Override
    public int save(Product product) {
        products.add(product);
        return products.size();
    }

    @Override
    public Optional<Product> findByTitle(String productTitle, List<Product> products) {
        for (Product findProduct : products) {
            if (findProduct.getTitle().equals(productTitle)) {
                product = findProduct;
            }
        }
        return Optional.ofNullable(product);
    }
}
