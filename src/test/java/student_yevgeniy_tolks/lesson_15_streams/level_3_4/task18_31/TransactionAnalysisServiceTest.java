package student_yevgeniy_tolks.lesson_15_streams.level_3_4.task18_31;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    public void findTransactionIn2011TestV1() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedTransactionList2011 = transactionAnalysisService
                .findTransactionIn2011(allTransactionList);
        int year2011 = expectedTransactionList2011.get(0).getYear();
        assertEquals(expectedTransactionList2011.size(), 2);
        assertEquals(year2011, 2011);
    }

    @Test
    public void findTransactionIn2011TestV2() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedTransactionList2011 = transactionAnalysisService
                .findTransactionByYear(allTransactionList, 2011);
        int year2011 = expectedTransactionList2011.get(0).getYear();
        assertEquals(expectedTransactionList2011.size(), 2);
        assertEquals(year2011, 2011);
    }

    @Test
    public void findTransactionIn2012Test() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedTransactionList2012 = transactionAnalysisService
                .findTransactionByYear(allTransactionList, 2012);
        int year2012 = expectedTransactionList2012.get(0).getYear();
        assertEquals(expectedTransactionList2012.size(), 4);
        assertEquals(year2012, 2012);
    }

    @Test
    public void findTransactionIn2013Test() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedTransactionList2013 = transactionAnalysisService
                .findTransactionByYear(allTransactionList, 2013);
        assertEquals(expectedTransactionList2013.size(), 0);
        assertEquals(expectedTransactionList2013, new ArrayList<>());
    }

    @Test
    public void sortTransactionByValueFromLowToHighTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedSortingResult = transactionAnalysisService.sortByValueFromLowToHigh(allTransactionList);
        int lowestValue = expectedSortingResult.get(0).getValue();
        int highestValue = expectedSortingResult.get(expectedSortingResult.size() - 1).getValue();
        assertEquals(lowestValue, 300);
        assertEquals(highestValue, 1000);
    }

    @Test
    public void sortTransactionByValueFromHighToLowTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedSortingResult = transactionAnalysisService.sortByValueFromHighToLow(allTransactionList);
        int highestValue = expectedSortingResult.get(0).getValue();
        int lowestValue = expectedSortingResult.get(expectedSortingResult.size() - 1).getValue();
        assertEquals(lowestValue, 300);
        assertEquals(highestValue, 1000);
    }

    @Test
    public void sortByYear2011AndByValueFromLowToHighTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedSortingResult = transactionAnalysisService.sortByYear2011AndByValueFromLowToHigh(allTransactionList);
        int year2011 = expectedSortingResult.get(0).getYear();
        int lowestValue = expectedSortingResult.get(0).getValue();
        int highestValue = expectedSortingResult.get(expectedSortingResult.size() - 1).getValue();
        assertEquals(year2011, 2011);
        assertEquals(expectedSortingResult.size(), 2);
        assertEquals(highestValue, 400);
        assertEquals(lowestValue, 300);
    }

    @Test
    public void getAllTransactionYearsTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Integer> expectedAllTransactionYearList = transactionAnalysisService
                .getAllTransactionYears(allTransactionList);
        List<Integer> actualTransactionYearList = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);
        assertEquals(expectedAllTransactionYearList, actualTransactionYearList);
    }

    @Test
    public void getAllUniqueTransactionYearsTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Integer> expectedAllUniqueTransactionYearList = transactionAnalysisService
                .getUniqueTransactionYears(allTransactionList);
        List<Integer> actualTransactionYearList = Arrays.asList(2011, 2012);
        assertEquals(expectedAllUniqueTransactionYearList, actualTransactionYearList);
    }

    @Test
    public void getAllUniqueTraderNames() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<String> expectedUniqueTraderNames = transactionAnalysisService
                .getUniqueTransactionTraderNames(allTransactionList);
        List<String> actualUniqueNameList = Arrays.asList("Brian", "Raoul", "Mario", "Alan");
        assertEquals(expectedUniqueTraderNames, actualUniqueNameList);
    }

    @Test
    public void getAllUniqueTraderCities() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<String> expectedUniqueTraderCity = transactionAnalysisService
                .getUniqueTransactionTraderCities(allTransactionList);
        List<String> actualUniqueCityList = Arrays.asList("Cambridge", "Milan");
        assertEquals(expectedUniqueTraderCity, actualUniqueCityList);
    }

    @Test
    public void findTradersFromCambridgeTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<String> expectedTraderList = transactionAnalysisService
                .getTraderNamesFromCambridge(allTransactionList);
        List<String> actualNamesFromCambridge = List.of("Brian", "Raoul", "Alan");
        assertEquals(expectedTraderList, actualNamesFromCambridge);
    }

    @Test
    public void findTraderFromDifferentCitiesTestV1() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<String> expectedTradersFromCambridge = transactionAnalysisService
                .getTraderNamesFromDifferentCities(allTransactionList, "Cambridge");
        List<String> actualNamesFromCambridge = List.of("Brian", "Raoul", "Alan");
        assertEquals(expectedTradersFromCambridge, actualNamesFromCambridge);
        assertEquals(expectedTradersFromCambridge.size(), 3);
    }

    @Test
    public void findTraderFromDifferentCitiesTestV2() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<String> expectedTradersFromMilan = transactionAnalysisService
                .getTraderNamesFromDifferentCities(allTransactionList, "Milan");
        List<String> actualNamesFromMilan = List.of("Mario");
        assertEquals(expectedTradersFromMilan, actualNamesFromMilan);
        assertEquals(expectedTradersFromMilan.size(), 1);
    }

    @Test
    public void findTraderFromDifferentCities() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<String> expectedTradersFromLondon = transactionAnalysisService
                .getTraderNamesFromDifferentCities(allTransactionList, "London");
        List<String> actualNamesFromLondon = List.of();
        assertEquals(expectedTradersFromLondon, actualNamesFromLondon);
        assertEquals(expectedTradersFromLondon.size(), 0);
    }

    @Test
    public void findAtLeastOneTraderFromMilanTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        boolean expectedAtLeastOneTraderFromMilan = transactionAnalysisService
                .findAtLeastOneTraderFromMilan(allTransactionList);
        assertTrue(expectedAtLeastOneTraderFromMilan);
    }

    @Test
    public void findAtLeastOneTraderFromMilanTestV2() {
        List<Transaction> allTransactionList = data.getTransactions();
        boolean expectedAtLeastOneTraderFromMilan = transactionAnalysisService
                .findAtLeastOneTraderFromChosenCity(allTransactionList, "Milan");
        assertTrue(expectedAtLeastOneTraderFromMilan);
    }

    @Test
    public void findAtLeastOneTraderFromLondonTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        boolean expectedAtLeastOneTraderFromLondon = transactionAnalysisService
                .findAtLeastOneTraderFromChosenCity(allTransactionList, "London");
        assertFalse(expectedAtLeastOneTraderFromLondon);
    }

    @Test
    public void findAtLeastOneTraderFromCambridgeTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        boolean expectedAtLeastOneTraderFromCambridge = transactionAnalysisService
                .findAtLeastOneTraderFromChosenCity(allTransactionList, "Cambridge");
        assertTrue(expectedAtLeastOneTraderFromCambridge);
    }


}