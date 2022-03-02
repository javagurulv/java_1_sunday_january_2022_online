package student_yevgeniy_tolks.lesson_3.level_5;

 class Dog {
        String dogName;
        int dogAge;
        String dogColor;

//constructor of class Dog
    Dog(String dogName,int dogAge,String dogColor){
        this.dogName=dogName;
        this.dogAge=dogAge;
        this.dogColor=dogColor;
    }
        String voice(){
        return this.dogName;
    }
       void happyBirthday(){
       this.dogAge=this.dogAge+1;
       System.out.println(dogAge + " years");
    }
       void changeColor(String newColor){
        this.dogColor=newColor;
        System.out.println(newColor);
    }
}
