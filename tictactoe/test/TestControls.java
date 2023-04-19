import static org.junit.Assert.assertEquals;

import org.junit.Test;

import view.BlockIndex;

public class TestControls extends TestGame {
    @Test
    public void testReset() {
        // 5. After resetting the app, the game has the expected initial configuration

        game.move(new BlockIndex(0, 0));
        game.move(new BlockIndex(1, 0));
        game.move(new BlockIndex(2, 0));

        game.resetGame();

        TestGame.assertInitialState(game);
    }

    @Test
    public void testProhibitedUndo() {
        // 6. If the user has not done at least one move, the user is not permitted to
        // undo.
        game.move(new BlockIndex(0, 0));

        game.undoMove();

        assertEquals(game.gameView.gameUndoView.isEnabled(), false);
    }

    @Test
    public void testLegalUndo() {
        // 7. If the user has done at least one move, the user is permitted to undo and
        // the game is updated appropriately.
        game.move(new BlockIndex(0, 0));

        game.undoMove();

        TestGame.assertInitialState(game);
    }
}
