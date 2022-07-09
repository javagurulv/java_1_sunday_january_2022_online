package student_deniss_dubko.deniss_dubko_lesson_11_homework.level_3_junior.task_8_10;

import java.util.List;
import java.util.Optional;

interface ProductDataBase {

    int save(Product product);

    Optional<Product> findByTitle(String productTitle,
                                  List<Product> products);

}