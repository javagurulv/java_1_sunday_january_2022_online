package student_devids_kropacovs.lesson13.level5;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}