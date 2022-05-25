package student_yevgeniy_tolks.lesson_11_interfaces.level_3.task8and10;

import java.util.List;
import java.util.Optional;

interface ProductDataBase {
    int save(Product product);

    Optional<Product> findByTitle(String productTitle, List<Product> products);
}
