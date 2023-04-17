import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.RowGameController;
import model.Player;
import model.RowBlockModel;

/**
 * An example test class, which merely shows how to write JUnit tests.
 */
public class TestExample {
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
    public void testNewGame() {
        assertEquals (Player.PLAYER_1, game.gameModel.getPlayer());
        assertEquals (9, game.gameModel.movesLeft);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewBlockViolatesPrecondition() {
        RowBlockModel block = new RowBlockModel(null);
    }
}
