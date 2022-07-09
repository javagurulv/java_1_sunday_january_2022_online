package student_deniss_dubko.deniss_dubko_lesson_13_homework.level_2_intern.task_7_13;

import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public List<BankClient> getClients() {
        return clients;
    }

    @Override
    public Optional<BankClient> findById(UserCredentials userCredentials,
                                         String userID)
        throws AccessDeniedException {
        if (userCredentials.hasRole(Role.CAN_SEARCH_CLIENT)) {
            throw new AccessDeniedException();
        } else {
            for (BankClient client : clients) {
                if (userID.equals(client.getUserID())) {
                    return Optional.of(client);
                }
            }
        }
        return Optional.empty();
    }

}