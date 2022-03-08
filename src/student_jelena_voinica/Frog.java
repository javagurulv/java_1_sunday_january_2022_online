package student_jelena_voinica;

public class Frog {

    private String name;
    private int age;

    public Frog(String frogName,int frogAge){

        this.name = frogName;
        this.age = frogAge;

    }

    public void voice(){
        System.out.println("kva kva kva");
    }

    public void voiceYourname(){
        System.out.println("My name is" + this.name);
    }

    public void voiceYourAge() {
        System.out.println("My age is " + this.age);
    }
}
