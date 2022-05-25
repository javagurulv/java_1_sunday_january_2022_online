package student_devids_kropacovs.lesson10.level2.task11;

import student_devids_kropacovs.lesson9.ProtectedClass;

class KidClass extends ParentClass {
    protected KidClass(int x) {
        super(x);
    }

    public static void main(String[] args) {
        ParentClass ParentClass = new ParentClass(5);
    }
}
