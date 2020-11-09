package template_method;

public abstract class Game {
	 
    protected int playersCount;

    abstract void initializeGame(int playersCount);

    abstract void makePlay(int player);

    abstract boolean endOfGame();

    abstract void printWinner();

    /* A template method : */
    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame(playersCount);
        int j = 0;
        while (!endOfGame()){
            makePlay(j);
            j = (j + 1) % playersCount;
        }
        printWinner();
    }
}

