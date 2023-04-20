import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Player;
import view.BlockIndex;

public class TestMove extends TestGame {
    @Test
    public void testIllegalMoveNoUpdate() {
        // 1. After performing an illegal move, the game is not updated.
        game.move(new BlockIndex(-1, -1));
        TestGame.assertInitialState(game);

        game.move(new BlockIndex(3, 3));
        TestGame.assertInitialState(game);
        
        game.move(new BlockIndex(0, 0));
        game.move(new BlockIndex(0, 0));
        
        assertEquals(8, game.gameModel.movesLeft);
        assertEquals(1, game.gameModel.movesMade.size());
    }

    @Test
    public void testLegalMoveUpdate() {
        // 2. After performing a legal move, the game is updated appropriately
        game.move(new BlockIndex(0, 0));

        assertEquals(Player.PLAYER_2, game.gameModel.getPlayer());
        assertEquals(8, game.gameModel.movesLeft);
    }
}
