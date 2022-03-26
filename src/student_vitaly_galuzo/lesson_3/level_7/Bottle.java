package student_vitaly_galuzo.lesson_3.level_7;

class Bottle {


    boolean open;
    boolean empty;
    String brand;


    public Bottle(boolean open,boolean empty,String brand){
        this.open = open;
        this.empty = empty;
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;

    }

    public void opened(){
        this.open = true;

    }
    public void closed(){
        this.open = false;

    }

    public boolean isOpen() {
        return open;
    }


    public void notFilled(){
        this.empty = true;

    }
    public void filled(){
        this.empty = false;
    }

    public boolean isEmpty() {
        return empty;
    }
}
