package student_sergei_klunkov.lesson_13.level_2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public List<BankClient> getClients() { return clients; }

    public Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws AccessDeniedException {

        if(credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        } else {
            for(BankClient client : clients) {
                if (uid.equals(client.getUid())) {
                    return Optional.of(client);
                }
            }
        }
        return Optional.empty();
    }

}
