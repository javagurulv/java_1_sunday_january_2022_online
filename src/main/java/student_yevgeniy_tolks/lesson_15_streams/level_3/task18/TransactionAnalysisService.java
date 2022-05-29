package student_yevgeniy_tolks.lesson_15_streams.level_3.task18;

import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> findTransactionIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }
}
