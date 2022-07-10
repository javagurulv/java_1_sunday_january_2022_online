package student_deniss_dubko.deniss_dubko_lesson_11_homework.level_3_junior.task_8_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements ProductDataBase {

    private List<Product> products = new ArrayList<>();
    private Product product;

    @Override
    public int save(Product product) {
        products.add(product);
        return products.size();
    }

    public Optional<Product> findByTitle(String productTitle,
                                         List<Product> products) {
        for (Product findProduct : products) {
            if (findProduct.getTitle().equals(productTitle)) {
                product = findProduct;
            }
        }
        return Optional.ofNullable(product);
    }

}