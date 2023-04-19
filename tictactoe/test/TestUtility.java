import static org.junit.Assert.assertEquals;

import controller.RowGameController;
import model.Player;
import model.RowBlockModel;

public class TestUtility {
    public static void assertInitialState(RowGameController c) {
        assertEquals(9, c.gameModel.movesLeft);
        assertEquals(true, c.gameModel.movesMade.isEmpty());
        assertEquals(Player.PLAYER_1, c.gameModel.getPlayer());

        for (RowBlockModel[] arr : c.gameModel.blocksData) {
            for (RowBlockModel b : arr) {
                assertEquals(true, b.getIsLegalMove());
                assertEquals("", b.getContents());
            }
        }

        assertEquals(null, c.gameModel.getFinalResult());
    }
}
