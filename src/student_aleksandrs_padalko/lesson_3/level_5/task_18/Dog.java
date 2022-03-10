package student_aleksandrs_padalko.lesson_3.level_5.task_18;

public class Dog { private String name;


    public Dog(String dogName) {
        this.name = dogName + "!" + dogName +"!"+ dogName+ "!";

    }

    public void voice() {

        System.out.println(this.name);
    }


    }



