package student_sergei_klunkov.lesson_10.level_1;

class Safe_2 {

    public String password;
    public int moneyInSafe;

    Safe_2(String password, int moneyInSafe) {

        this.moneyInSafe = moneyInSafe;
        this.password = password;

    }

    public int getMoneyInSafe(String correctPassword, int moneyToTake){
        if(this.password.equals(correctPassword)&&this.moneyInSafe >= moneyToTake){
            this.moneyInSafe -= moneyToTake;
            return moneyToTake;
        } else {
            return 0;
        }
    }

    public int putMoneyAmountInSafe(String correctPassword, int depositMoney){
        if(this.password.equals(correctPassword)){
            this.moneyInSafe += depositMoney;
            return depositMoney;
        } else {
            return 0;
        }
    }

    public int getSafeBalance(){
        return this.moneyInSafe;
    }


}