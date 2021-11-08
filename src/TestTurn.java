import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class TestTurn {
    @Test
    public void TestTurnSymbol_ShouldReturnX() {
        GameControls g = new GameControls();

        g.Initialize();

        assertEquals("X", g.Turn().TurnSymbol());
    }

    @Test
    public void TestTurnSymbol_ShouldReturnO() {
        GameControls g = new GameControls();

        g.Initialize();
        g.Turn().NextTurn();

        assertEquals("O", g.Turn().TurnSymbol());
    }

    @Test
    public void TestNbOfTurn_ShouldReturn0() {
        GameControls g = new GameControls();

        g.Initialize();

        assertEquals(0, g.Turn().NbOfTurn());
    }

    @Test
    public void TestNextTurn_nbOfTurnSould_Be1() {
        GameControls g = new GameControls();

        g.Initialize();

        g.Turn().NextTurn();

        assertEquals(1, g.Turn().NbOfTurn());
    }
}
