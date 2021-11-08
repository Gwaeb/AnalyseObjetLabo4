import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class TestPlayerControls {
    @Test
    public void TestSymbolP1_ShouldReturnX() {
        GameControls g = new GameControls();
        g.Initialize();

        String result = g.P1().Symbol();

        assertEquals("X", result);
    }

    @Test
    public void TestSymbolP2_ShouldReturnO() {
        GameControls g = new GameControls();
        g.Initialize();

        String result = g.P2().Symbol();

        assertEquals("O", result);
    }

    @Test
    public void TestNextMove_A1() {
        GameControls g = new GameControls();
        g.Initialize();

        boolean actual = g.P1().NextMove("A1");

        assertTrue(actual);
    }

    @Test
    public void TestNextMove_A2() {
        GameControls g = new GameControls();
        g.Initialize();

        boolean actual = g.P1().NextMove("A2");

        assertTrue(actual);
    }

    @Test
    public void TestNextMove_A3() {
        GameControls g = new GameControls();
        g.Initialize();

        boolean actual = g.P1().NextMove("A3");

        assertTrue(actual);
    }

    @Test
    public void TestNextMove_B1() {
        GameControls g = new GameControls();
        g.Initialize();

        boolean actual = g.P1().NextMove("B1");

        assertTrue(actual);
    }

    @Test
    public void TestNextMove_B2() {
        GameControls g = new GameControls();
        g.Initialize();

        boolean actual = g.P1().NextMove("B2");

        assertTrue(actual);
    }

    @Test
    public void TestNextMove_B3() {
        GameControls g = new GameControls();
        g.Initialize();

        boolean actual = g.P1().NextMove("B3");

        assertTrue(actual);
    }

    @Test
    public void TestNextMove_C1() {
        GameControls g = new GameControls();
        g.Initialize();

        boolean actual = g.P1().NextMove("C1");

        assertTrue(actual);
    }

    @Test
    public void TestNextMove_C2() {
        GameControls g = new GameControls();
        g.Initialize();

        boolean actual = g.P1().NextMove("C2");

        assertTrue(actual);
    }

    @Test
    public void TestNextMove_C3() {
        GameControls g = new GameControls();
        g.Initialize();

        boolean actual = g.P1().NextMove("C3");

        assertTrue(actual);
    }

    @Test
    public void TestNextMove_NotASquare() {
        GameControls g = new GameControls();
        g.Initialize();

        boolean actual = g.P1().NextMove("F4");

        assertFalse(actual);
    }
}
