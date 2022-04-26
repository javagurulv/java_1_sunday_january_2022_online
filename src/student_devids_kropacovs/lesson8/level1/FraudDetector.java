package student_devids_kropacovs.lesson8.level1;

import java.util.List;

public class FraudDetector {

    private List <FraudRule> fraudRules;
    public FraudDetector (List <FraudRule> fraudRules){
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t)
    {

        Trader trader = t.getTrader();
     for (FraudRule fraudRule : fraudRules){
           if (fraudRule.isFraud(t)){
               System.out.println("Transaction is false: rule: " + fraudRule.getRuleName());
               System.out.println("All the information about that transaction: Trader name: " + trader.getFullName());
               System.out.println("Trader country: " + trader.getCountry() + " Trader city: " + trader.getCity());
               System.out.println(trader.getFullName() + " wanted to make a transaction of " + t.getAmount());
               return new FraudDetectionResult(fraudRule.isFraud(t), fraudRule.getRuleName());
           }
     }
     return new FraudDetectionResult(false, null);
    }

}
