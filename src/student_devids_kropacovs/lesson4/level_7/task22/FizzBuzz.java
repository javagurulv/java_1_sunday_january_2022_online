package student_devids_kropacovs.lesson4.level_7.task22;

class FizzBuzz {
    int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String fizzBuzzGame() {
        if (number % 3 == 0 && number % 5 != 0) {
            return "Fizz";
        } else if (number % 5 == 0 & number % 3 != 0) {
            return "Buzz";
        } else if (number % 5 == 0 && number % 3 == 0) {
            return "FizzBuzz";
        } else {
            return "" + number;
        }
    }

}
