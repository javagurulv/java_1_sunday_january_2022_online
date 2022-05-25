package student_sergei_klunkov.lesson_10.level_2.task_11;

class Family {
    private String name;
    private int age;
    protected Family(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public String toString() {
        return "Son{" +
                "Name:" + name + '\'' +
                ", age:" + age +
                '}';
    }
}
