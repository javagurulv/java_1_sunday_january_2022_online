package student_devids_kropacovs.lesson6.level7;

class FizzBuzz {




    public String detect(int number) {

        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;
    }




}
/*Разберитесь, что делает класс указанный ниже.
        Создайте класс FizzBuzzTest и напишите автоматические тесты
        на все сценарии. Упростите FizzBuzz класс!
        Убедитесь, что после упрощения все автоматические тесты проходят.

        Подсказка: а нужно ли свойство класса initialNumber?
        Или метод detect можно реализовать без него?

class FizzBuzz {

    private int initialNumber;

    public String detect(int number) {
        this.initialNumber = number;
        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz";
        else if (initialNumber % 3 == 0) return "Fizz";
        else if (initialNumber % 5 == 0) return "Buzz";
        else return "" + initialNumber;
    }

}*/