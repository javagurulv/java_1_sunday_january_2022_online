package student_elina_kucenko.lesson3.level7.task29;

class Table {
    String color;
    String size;
    int weight;

    Table (String color, String size, int weight) {
        this.color =color;
        this.size=size;
        this.weight=weight;

    }
    public void describeThisTable (){
        System.out.println("This table is "+color+". It weights "+weight+" kilos, so it is "+size+" size");

        //If Table weights more than 10 kilos its considered big size
    }public void changeTableWeight(int newWeight){
        weight=newWeight;
        if(weight>10){
            size="big";
        }else {
            size="small";
        }

    }public void changeTableColorAndWeight(String newColor, int newWeight){
        color=newColor;
        weight=newWeight;
        if(weight>10){
            size="big";
        }else {
            size="small";
        }
    }
}
