package student_stanislav_astafjev.lesson_3.Task_29;

class TeaPot {
    String brand;
    String color;
    int heat;
    TeaPot(String teapotBrand,String teapotColor,int teapotHeat){
        this.brand = teapotBrand;
        this.color = teapotColor;
        this.heat = teapotHeat;
    }
    void voiceYourBrand(){
        System.out.println("This brand name is " + this.brand);
    }
    void voiceYourColor(){
        System.out.println("This brand color is " + this.color);
    }
    void voiceYourTimer(){
        System.out.println("This brand heating timer " + this.heat + " minute");
    }
}
