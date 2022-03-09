package student_devids_kropacovs.guessingGame;

class Guessing_game {
    Player p;
    public void startGame(){
        p = new Player();
        int playersGuess = 0;
        boolean pIsRight = false;
        int targetNumber = (int) (Math.random() * 10 + 1);
        System.out.println("I am guessing a number from 1 to 10");
        while(true){
            p.guess();

            playersGuess = p.number();
            if(playersGuess == targetNumber){
                System.out.println("You have guessed!");
                break;
            }else{
                System.out.println("Guess again!");
            }
        }
    }
}
