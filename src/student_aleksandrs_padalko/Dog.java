package student_aleksandrs_padalko;

public class Dog { private String name;


    public Dog(String dogName) {
        this.name = dogName + "!" + dogName +"!"+ dogName+ "!";

    }

    public void voice() {

        System.out.println(this.name);
    }


    }



