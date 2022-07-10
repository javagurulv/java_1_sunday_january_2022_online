package student_sergei_klunkov.lesson_13.level_5_to_6;

import java.util.List;
interface ProductValidator {

    List<ValidationException> validate(Product product);
}
