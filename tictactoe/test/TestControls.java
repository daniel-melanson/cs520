import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.RowGameController;
import view.BlockIndex;

public class TestControls {
    private RowGameController game;

    @Before
    public void setUp() {
        game = new RowGameController();
    }

    @After
    public void tearDown() {
        game = null;
    }

    @Test
    public void testReset() {
        // 5. After resetting the app, the game has the expected initial configuration

        game.move(new BlockIndex(0, 0));
        game.move(new BlockIndex(1, 0));
        game.move(new BlockIndex(2, 0));

        game.gameModel.assertInitialState();
    }

    @Test
    public void testProhibitedUndo() {
        // 6. If the user has not done at least one move, the user is not permitted to
        // undo.
    }

    @Test
    public void testLegalUndo() {
        // 7. If the user has done at least one move, the user is permitted to undo and
        // the game is updated appropriately.
        game.move(new BlockIndex(0, 0));

        game.undoMove();

        game.gameModel.assertInitialState();
    }
}
