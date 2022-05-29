package student_yevgeniy_tolks.lesson_15_streams.level_3_4.task18_31;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> findTransactionIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    List<Transaction> findTransactionByYear(List<Transaction> transactions, int yearOfTransaction) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == yearOfTransaction)
                .collect(Collectors.toList());

    }

    List<Transaction> sortByValueFromLowToHigh(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Transaction> sortByValueFromHighToLow(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    List<Transaction> sortByYear2011AndByValueFromLowToHigh(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Integer> getAllTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }
    List<Integer> getUniqueTransactionYears(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }
}
