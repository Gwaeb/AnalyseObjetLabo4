import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class TestGameControls {

    @Test
    public void TestBoard_ShouldReturnABoard() {
        GameControls g = new GameControls();

        g.Initialize();

        assertEquals(Board.class, g.Board().getClass());
    }

    @Test
    public void TestTurn_ShouldReturnATurn() {
        GameControls g = new GameControls();

        g.Initialize();

        assertEquals(Turn.class, g.Turn().getClass());
    }

    @Test
    public void TestP1_ShouldReturnAPlayerControls() {
        GameControls g = new GameControls();

        g.Initialize();

        assertEquals(PlayerControls.class, g.P1().getClass());
    }

    @Test
    public void TestP2_ShouldReturnAPlayerControls() {
        GameControls g = new GameControls();

        g.Initialize();

        assertEquals(PlayerControls.class, g.P2().getClass());
    }

    @Test
    public void TestInitialize_BoardNotNull() {
        GameControls g = new GameControls();

        g.Initialize();

        assertNotNull(g.Board());
    }

    @Test
    public void TestInitialize_TurnNotNull() {
        GameControls g = new GameControls();

        g.Initialize();

        assertNotNull(g.Turn());
    }

    @Test
    public void TestInitialize_Player1NotNull() {
        GameControls g = new GameControls();

        g.Initialize();

        assertNotNull(g.P1());
    }

    @Test
    public void TestInitialize_Player2NotNull() {
        GameControls g = new GameControls();

        g.Initialize();

        assertNotNull(g.P2());
    }

}
