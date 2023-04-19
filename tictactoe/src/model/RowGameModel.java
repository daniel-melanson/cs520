package model;

public class RowGameModel {
    public static final String GAME_END_NOWINNER = "Game ends in a draw";

    public RowBlockModel[][] blocksData = new RowBlockModel[3][3];

    /**
     * The current player taking their turn
     */
    private Player player = Player.PLAYER_1;
    public int movesLeft = 9;

    private String finalResult = null;

    public RowGameModel() {
        super();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                blocksData[row][col] = new RowBlockModel(this);
                blocksData[row][col].assertInitialState();
            } // end for col
        } // end for row
        // 
        this.assertInitialState();
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        // Perform input validation
        if (player == null) {
            throw new IllegalArgumentException("The player must be non-null.");
        }

        this.player = player;
    }

    public String getFinalResult() {
        return this.finalResult;
    }

    public void setFinalResult(String finalResult) {
        this.finalResult = finalResult;
    }
    
    public void assertInitialState() {
        assert this.movesLeft == 9;
        assert this.player == Player.PLAYER_1;

        for (int i = 0; i < this.blocksData.length; i++) {
            for (int j = 0; j < this.blocksData[i].length; j++) {
                this.blocksData[i][j].assertInitialState();
            }
        }
    }
}
