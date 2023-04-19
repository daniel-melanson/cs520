import static org.junit.Assert.assertEquals;

import org.junit.Test;

import view.BlockIndex;

public class TestGameEnd extends TestGame {
    private void move(int r, int c) {
        game.move(new BlockIndex(r, c));
    }

    @Test
    public void testPlayerOneWin() {
        // 3. One of the players wins the game.

        move(0, 0);
        move(2, 0);

        move(0, 1);
        move(2, 1);

        move(0, 2);

        assertEquals(game.gameModel.getFinalResult(), "Player 1 wins!");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(game.gameModel.blocksData[i][j].getIsLegalMove(), false);
            }
        }
    }

    @Test
    public void testTie() {
        // 4. The players tie the game.
        move(0, 0);
        move(2, 2);

        move(0, 1);
        move(2, 1);

        move(2, 0);
        move(0, 2);

        move(1, 2);
        move(1, 0);

        move(1, 1);

        assertEquals(game.gameModel.movesLeft, 0);
        assertEquals(game.gameModel.getFinalResult(), "Game ends in a draw");
    }
}
