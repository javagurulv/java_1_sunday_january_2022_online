package student_sergei_klunkov.lesson_13.level_2;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid)
        throws AccessDeniedException;

}
