import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.RowGameController;
import model.Player;
import view.BlockIndex;

public class TestMove {
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
    public void testIllegalMoveNoUpdate() {
        // 1. After performing an illegal move, the game is not updated.
        game.move(new BlockIndex(-1, -1));
        TestUtility.assertInitialState(game);

        game.move(new BlockIndex(3, 3));
        TestUtility.assertInitialState(game);
    }

    @Test
    public void testLegalMoveUpdate() {
        // 2. After performing a legal move, the game is updated appropriately
        game.move(new BlockIndex(0, 0));

        assertEquals(Player.PLAYER_2, game.gameModel.getPlayer());
        assertEquals(8, game.gameModel.movesLeft);
    }
}
