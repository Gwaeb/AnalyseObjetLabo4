import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class TestBoard {
    @Test
    public void TestIsSquareFree_A1() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "A1";

        boolean result = g.Board().IsSquareFree(square);

        assertTrue(result);
    }

    @Test
    public void TestIsSquareFree_A2() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "A2";

        boolean result = g.Board().IsSquareFree(square);

        assertTrue(result);
    }

    @Test
    public void TestIsSquareFree_A3() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "A3";

        boolean result = g.Board().IsSquareFree(square);

        assertTrue(result);
    }

    @Test
    public void TestIsSquareFree_B1() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "B1";

        boolean result = g.Board().IsSquareFree(square);

        assertTrue(result);
    }

    @Test
    public void TestIsSquareFree_B2() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "B2";

        boolean result = g.Board().IsSquareFree(square);

        assertTrue(result);
    }

    @Test
    public void TestIsSquareFree_B3() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "B3";

        boolean result = g.Board().IsSquareFree(square);

        assertTrue(result);
    }

    @Test
    public void TestIsSquareFree_C1() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "C1";

        boolean result = g.Board().IsSquareFree(square);

        assertTrue(result);
    }

    @Test
    public void TestIsSquareFree_C2() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "C2";

        boolean result = g.Board().IsSquareFree(square);

        assertTrue(result);
    }

    @Test
    public void TestIsSquareFree_C3() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "C3";

        boolean result = g.Board().IsSquareFree(square);

        assertTrue(result);
    }

    @Test
    public void TestSetSquare_A1() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "A1";
        String symbol = "X";

        g.Board().SetSquare(square, symbol);

        boolean result = g.Board().IsSquareFree(square);

        assertFalse(result);
    }

    @Test
    public void TestSetSquare_A2() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "A2";
        String symbol = "X";

        g.Board().SetSquare(square, symbol);

        boolean result = g.Board().IsSquareFree(square);

        assertFalse(result);
    }

    @Test
    public void TestSetSquare_A3() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "A3";
        String symbol = "X";

        g.Board().SetSquare(square, symbol);

        boolean result = g.Board().IsSquareFree(square);

        assertFalse(result);
    }

    @Test
    public void TestSetSquare_B1() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "B1";
        String symbol = "X";

        g.Board().SetSquare(square, symbol);

        boolean result = g.Board().IsSquareFree(square);

        assertFalse(result);
    }

    @Test
    public void TestSetSquare_B2() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "B2";
        String symbol = "X";

        g.Board().SetSquare(square, symbol);

        boolean result = g.Board().IsSquareFree(square);

        assertFalse(result);
    }

    @Test
    public void TestSetSquare_B3() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "B3";
        String symbol = "X";

        g.Board().SetSquare(square, symbol);

        boolean result = g.Board().IsSquareFree(square);

        assertFalse(result);
    }

    @Test
    public void TestSetSquare_C1() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "C1";
        String symbol = "X";

        g.Board().SetSquare(square, symbol);

        boolean result = g.Board().IsSquareFree(square);

        assertFalse(result);
    }

    @Test
    public void TestSetSquare_C2() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "C2";
        String symbol = "X";

        g.Board().SetSquare(square, symbol);

        boolean result = g.Board().IsSquareFree(square);

        assertFalse(result);
    }

    @Test
    public void TestSetSquare_C3() {
        GameControls g = new GameControls();

        g.Initialize();

        String square = "C3";
        String symbol = "X";

        g.Board().SetSquare(square, symbol);

        boolean result = g.Board().IsSquareFree(square);

        assertFalse(result);
    }

    @Test
    public void TestGameIsWin_A() {
        GameControls g = new GameControls();

        g.Initialize();

        String square1 = "A1";
        String square2 = "A2";
        String square3 = "A3";
        String symbol = "X";

        g.Board().SetSquare(square1, symbol);
        g.Board().SetSquare(square2, symbol);
        g.Board().SetSquare(square3, symbol);

        boolean result = g.Board().GameIsWin(0);

        assertTrue(result);
    }

    @Test
    public void TestGameIsWin_B() {
        GameControls g = new GameControls();

        g.Initialize();

        String square1 = "B1";
        String square2 = "B2";
        String square3 = "B3";
        String symbol = "X";

        g.Board().SetSquare(square1, symbol);
        g.Board().SetSquare(square2, symbol);
        g.Board().SetSquare(square3, symbol);

        boolean result = g.Board().GameIsWin(0);

        assertTrue(result);
    }

    @Test
    public void TestGameIsWin_C() {
        GameControls g = new GameControls();

        g.Initialize();

        String square1 = "C1";
        String square2 = "C2";
        String square3 = "C3";
        String symbol = "X";

        g.Board().SetSquare(square1, symbol);
        g.Board().SetSquare(square2, symbol);
        g.Board().SetSquare(square3, symbol);

        boolean result = g.Board().GameIsWin(0);

        assertTrue(result);
    }

    @Test
    public void TestGameIsWin_1() {
        GameControls g = new GameControls();

        g.Initialize();

        String square1 = "A1";
        String square2 = "B1";
        String square3 = "C1";
        String symbol = "X";

        g.Board().SetSquare(square1, symbol);
        g.Board().SetSquare(square2, symbol);
        g.Board().SetSquare(square3, symbol);

        boolean result = g.Board().GameIsWin(0);

        assertTrue(result);
    }

    @Test
    public void TestGameIsWin_2() {
        GameControls g = new GameControls();

        g.Initialize();

        String square1 = "A2";
        String square2 = "B2";
        String square3 = "C2";
        String symbol = "X";

        g.Board().SetSquare(square1, symbol);
        g.Board().SetSquare(square2, symbol);
        g.Board().SetSquare(square3, symbol);

        boolean result = g.Board().GameIsWin(0);

        assertTrue(result);
    }

    @Test
    public void TestGameIsWin_3() {
        GameControls g = new GameControls();

        g.Initialize();

        String square1 = "A3";
        String square2 = "B3";
        String square3 = "C3";
        String symbol = "X";

        g.Board().SetSquare(square1, symbol);
        g.Board().SetSquare(square2, symbol);
        g.Board().SetSquare(square3, symbol);

        boolean result = g.Board().GameIsWin(0);

        assertTrue(result);
    }

    @Test
    public void TestGameIsWin_DiagoA1C3() {
        GameControls g = new GameControls();

        g.Initialize();

        String square1 = "A1";
        String square2 = "B2";
        String square3 = "C3";
        String symbol = "X";

        g.Board().SetSquare(square1, symbol);
        g.Board().SetSquare(square2, symbol);
        g.Board().SetSquare(square3, symbol);

        boolean result = g.Board().GameIsWin(0);

        assertTrue(result);
    }

    @Test
    public void TestGameIsWin_DiagoC1A3() {
        GameControls g = new GameControls();

        g.Initialize();

        String square1 = "C1";
        String square2 = "B2";
        String square3 = "A3";
        String symbol = "X";

        g.Board().SetSquare(square1, symbol);
        g.Board().SetSquare(square2, symbol);
        g.Board().SetSquare(square3, symbol);

        boolean result = g.Board().GameIsWin(0);

        assertTrue(result);
    }

    @Test
    public void TestGameIsWin_Turn9ForTIE() {
        GameControls g = new GameControls();

        g.Initialize();

        boolean result = g.Board().GameIsWin(9);

        assertTrue(result);
    }

    @Test
    public void TestGameIsWin_NotWin() {
        GameControls g = new GameControls();

        g.Initialize();

        String square1 = "B1";
        String square2 = "B2";
        String square3 = "A3";
        String symbol = "X";

        g.Board().SetSquare(square1, symbol);
        g.Board().SetSquare(square2, symbol);
        g.Board().SetSquare(square3, symbol);

        boolean result = g.Board().GameIsWin(0);

        assertFalse(result);
    }
}
