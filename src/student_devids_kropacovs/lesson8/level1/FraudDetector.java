package student_devids_kropacovs.lesson8.level1;

import java.util.List;

public class FraudDetector {

    private List <FraudRule> fraudRules;
    public FraudDetector (List <FraudRule> fraudRules){
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t)
    {
     for (FraudRule fraudRule : fraudRules){
           if (fraudRule.isFraud(t)){
               return true;
           }
     }
     return false;
    }

}
