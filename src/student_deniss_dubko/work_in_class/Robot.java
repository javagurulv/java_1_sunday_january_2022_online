package student_deniss_dubko.work_in_class;

class Robot {

    private String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public String sayHello() {
        return "Hello!";
    }

    public int[] createArray(int arraySize) {
        return new int[arraySize];
    }


}
