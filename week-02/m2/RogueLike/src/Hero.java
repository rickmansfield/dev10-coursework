public class Hero {
    private final String name;
    private char symbol;
    private int x;
    private int y;
    private boolean treasure1Obtained;
    private boolean treasure2Obtained;

    //create a hero with a name and an initial position
    public Hero(String name, char symbol, int x, int y, boolean treasure1Obtained, boolean treasure2Obtained) {
        this.name = name;
        this.symbol = symbol;
        this.x = x;
        this.y = y;
        this.treasure1Obtained = false;
        this.treasure2Obtained = false;
    }
    //getters
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getTreasure1Obtained() {
        return treasure1Obtained;
    }
    public boolean getTreasure2Obtained() {
        return treasure2Obtained;
    }

    //Setters
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    public void setTreasure1Obtained(boolean treasure1Obtained) {
        this.treasure1Obtained = treasure1Obtained;
    }
    public void setTreasure2Obtained(boolean treasure2Obtained) {
        this.treasure2Obtained = treasure2Obtained;
    }


    // movement
    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }
}
