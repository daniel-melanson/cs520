import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.RowGameController;

public class TestGameEnd {
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
    public void testPlayerOneWin() {
        // 3. One of the players wins the game.
    }

    @Test
    public void testTie() {
        // 4. The players tie the game.
    }
}
