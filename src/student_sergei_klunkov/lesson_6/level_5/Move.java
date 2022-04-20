package student_sergei_klunkov.lesson_6.level_5;

class Move {

    private int x;
    private int y;
    private Player player;

    public Move(int x, int y, Player player) {
        this.x = x;
        this.y = y;
        this.player = player;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Player getPlayer(){
        return player;
    }

}
