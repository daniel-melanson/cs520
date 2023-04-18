import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.RowGameController;

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
    }

    @Test
    public void testLegalMoveUpdate() {
        // 2. After performing a legal move, the game is updated appropriately
    }
}
