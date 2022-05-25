package student_alina_strumpe._lesson_3._level_7_senior_Task_29;

public class Printer {

    public boolean isON;
    public String name;
    public String color;
    public double price;

    public Printer(String pName){
        this.name= pName;
    }

    public Printer(String pName, String pColor, double pPrice, boolean isON){
        this.name = pName;
        this.color = pColor;
        this.price = pPrice;
        this.isON = isON;
    }


    public void switchON() {
        boolean isON = true;
        System.out.println("Switched ON");
    }

   // public void displayName(){ System.out.println("Brother");}
     public void displayEmpty() { System.out.println("Out of paper");}
       public void displayReady(){ System.out.println("Ready");}

    public double getPrice(){ return this.price ;}

    public void switchOFF(){
        boolean isON = false;
         System.out.println("Switched OFF");
    }

}

