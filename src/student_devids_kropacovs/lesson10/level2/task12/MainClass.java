package student_devids_kropacovs.lesson10.level2.task12;

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}
// Как я понимаю, При создание потомка, сначала генерируеться конструктор родителся, поэтому по цепочки он будет создаваться до класса Объект
// То есть, так как у нас в конструктрое родителей есть вывод строки, он будет это делать по иерархии С родителя до потомка и послдним
// имплементирует конструктор класса потомка, который мы создали