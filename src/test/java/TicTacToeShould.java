import com.codurance.TicTacToe;
import com.codurance.Tile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TicTacToeShould {

    private TicTacToe ticTacToe;
    @BeforeEach
    public void setUp() {
        ticTacToe = new TicTacToe();
    }
    @Test
    public void show_empty_board() {
        assertEquals("123456789", ticTacToe.showBoard());
    }

    @Test
    public void place_1_X_on_tile_1() {
        Tile tile = new Tile(1);
        ticTacToe.placeX(tile);
        assertEquals("X23456789", ticTacToe.showBoard());
    }

    @Test
    public void place_X_on_tile_2() {
        Tile tile = new Tile(2);
        ticTacToe.placeX(tile);
        assertEquals("1X3456789", ticTacToe.showBoard());
    }

    @Test
    public void place_X_on_tile_1_and_2() {
        ticTacToe.placeX(new Tile(1));
        ticTacToe.placeX(new Tile(2));
        assertEquals("XX3456789", ticTacToe.showBoard());
    }

    @Test
    public void place_O_on_tile_1() {
        ticTacToe.placeO(new Tile(1));
        assertEquals("O23456789", ticTacToe.showBoard());
    }

    @Test
    public void place_O_on_tile_2() {
        Tile tile = new Tile(2);
        ticTacToe.placeO(tile);
        assertEquals("1O3456789", ticTacToe.showBoard());
    }

    @Test
    public void place_O_on_tile_1_and_2(){
        ticTacToe.placeO(new Tile(1));
        ticTacToe.placeO(new Tile(2));
        assertEquals("OO3456789", ticTacToe.showBoard());
    }

    @Test
    public void win_if_XXX_on_top_row() {
        ticTacToe.placeX(new Tile(1));
        ticTacToe.placeX(new Tile(2));
        ticTacToe.placeX(new Tile(3));
        assertTrue(ticTacToe.isWin());
    }

    @Test
    public void not_win_if_XOX_on_top_row() {
        ticTacToe.placeX(new Tile(1));
        ticTacToe.placeO(new Tile(2));
        ticTacToe.placeX(new Tile(3));
        assertFalse(ticTacToe.isWin());
    }

    @Test
    public void win_if_XXX_on_middle_row() {
        ticTacToe.placeX(new Tile(4));
        ticTacToe.placeX(new Tile(5));
        ticTacToe.placeX(new Tile(6));
        assertTrue(ticTacToe.isWin());
    }

    @Test
    public void win_if_XXX_on_bottom_row() {
        ticTacToe.placeX(new Tile(7));
        ticTacToe.placeX(new Tile(8));
        ticTacToe.placeX(new Tile(9));
        assertTrue(ticTacToe.isWin());
    }

    @Test
    public void win_if_XXX_on_top_row_with_full_board() {
        //XXX
        //XOX
        //OXO
        ticTacToe.placeX(new Tile(1));
        ticTacToe.placeX(new Tile(2));
        ticTacToe.placeX(new Tile(3));
        ticTacToe.placeX(new Tile(4));
        ticTacToe.placeO(new Tile(5));
        ticTacToe.placeX(new Tile(6));
        ticTacToe.placeO(new Tile(7));
        ticTacToe.placeX(new Tile(8));
        ticTacToe.placeO(new Tile(9));
        assertTrue(ticTacToe.isWin());
    }

    @Test
    public void win_if_XXX_on_middle_row_with_full_board() {
        ticTacToe.placeO(new Tile(1));
        ticTacToe.placeX(new Tile(2));
        ticTacToe.placeO(new Tile(3));
        ticTacToe.placeX(new Tile(4));
        ticTacToe.placeX(new Tile(5));
        ticTacToe.placeX(new Tile(6));
        ticTacToe.placeO(new Tile(7));
        ticTacToe.placeO(new Tile(8));
        ticTacToe.placeX(new Tile(9));
        assertTrue(ticTacToe.isWin());
    }
}
