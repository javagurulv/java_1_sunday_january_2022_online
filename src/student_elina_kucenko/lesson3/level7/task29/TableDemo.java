package student_elina_kucenko.lesson3.level7.task29;

public class TableDemo {
    public static void main(String[] args) {
        Table table = new Table("white","small", 10);
        table.describeThisTable();
        table.changeTableWeight(20);
        table.describeThisTable();
        table.changeTableColorAndWeight("red",6);
        table.describeThisTable();
    }
}
