package student_elina_kucenko.lesson3.level7.task29;

class PC {
    String name;
    String type;
    int productionYear;

    public void setName(String name) {
        this.name = name;
    }

    public void setProductionYear (int productionYear) {
        this.productionYear= productionYear;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void sayYourNameAndType (){
        System.out.println("This PC is produced in "+productionYear+" by "+name+" and its type is "+type);
    }
}
