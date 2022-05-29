package student_sergei_klunkov.lesson_11.level_3.task_8_10;

import java.util.List;
import java.util.Optional;

interface ProductDatabase {

    int save(Product product);

    Optional <Product> findByTitle(String productTitle, List<Product> products);
}
