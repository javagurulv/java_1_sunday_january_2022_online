package student_devids_kropacovs.lesson10.level1.task5;

public class Safe2 {
    private int amountInSafe;
    private int code;

    public Safe2 (int safeCode, int amountInSafe){
        this.code = safeCode;
        this.amountInSafe = amountInSafe;
    }

    public int getMoney(int safeCode, int amountToTake){
        if(safeCode == this.code){
            int i = this.amountInSafe - amountToTake;
            System.out.println("Amount left - " + i);
            return  this.amountInSafe = this.amountInSafe - amountToTake;

        }
        System.out.println("Incorrect Safe Code");
        return 0;
    }

    public int putMoney(int safeCode, int amountToPut){
        if(safeCode == this.code){
            int i = this.amountInSafe + amountToPut;
            System.out.println("Amount left - " + i);
            return this.amountInSafe = this.amountInSafe + amountToPut;
        }
        System.out.println("Incorrect Safe Code");
        return 0;
    }
}
