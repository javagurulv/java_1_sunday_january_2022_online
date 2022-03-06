package student_elina_kucenko;

public class Income {
    String name;
    int age;
    int incomeBruto;
    boolean citizenship=false;

    Income (String name,  int incomeBruto, int age){
        this.name=name;
        this.age=age;
        this.incomeBruto=incomeBruto;

    }

    public int calculateNetoIncome(){
        return (int) (incomeBruto-(incomeBruto*0.3));
    }

    public void CitizenshipYes(){
        this.citizenship=true;
    }

    public boolean giveCitizenship(){
        return this.citizenship;
    }

}
