import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Player;
import model.RowBlockModel;

/**
 * An example test class, which merely shows how to write JUnit tests.
 */
public class TestExample extends TestGame {
    @Test
    public void testNewGame() {
        assertEquals(Player.PLAYER_1, game.gameModel.getPlayer());
        assertEquals(9, game.gameModel.movesLeft);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewBlockViolatesPrecondition() {
        RowBlockModel block = new RowBlockModel(null);
    }
}
