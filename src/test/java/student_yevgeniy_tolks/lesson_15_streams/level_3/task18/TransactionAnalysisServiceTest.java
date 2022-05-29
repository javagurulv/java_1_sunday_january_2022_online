package student_yevgeniy_tolks.lesson_15_streams.level_3.task18;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {
    TransactionAnalysisService transactionAnalysisService;
    TransactionTestData data;

    @Before
    public void init() {
        transactionAnalysisService = new TransactionAnalysisService();
        data = new TransactionTestData();
    }

    @Test
    public void findTransactionIn2011() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedTransactionList2011 = transactionAnalysisService
                .findTransactionIn2011(allTransactionList);
        assertEquals(expectedTransactionList2011.size(), 2);
    }
}