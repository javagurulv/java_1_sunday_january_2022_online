package student_yevgeniy_tolks.lesson_13_exceptions.level_2.task_7_17;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findById(UserCredentials userCredentials, String userID)
            throws AccessDeniedException;

}
