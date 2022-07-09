package student_deniss_dubko.deniss_dubko_lesson_13_homework.level_2_intern.task_7_13;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findById(UserCredentials userCredentials,
                                  String userID)
        throws AccessDeniedException;

}