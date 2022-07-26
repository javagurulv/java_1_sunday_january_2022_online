package student_stanislav_astafjev.lesson_10.task_13;

class ClassY extends ClassX{
   public ClassY(int i) {
       super(i);
       System.out.println(2);
    }
}
class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}
