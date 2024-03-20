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
    public void place_1_x_on_tile_1() {
        Tile tile = new Tile(1);
        ticTacToe.placeX(tile);
        assertEquals("X23456789", ticTacToe.showBoard());
    }

    @Test
    public void place_x_on_tile_2() {
        Tile tile = new Tile(2);
        ticTacToe.placeX(tile);
        assertEquals("1X3456789", ticTacToe.showBoard());
    }

    @Test
    public void place_x_on_tile_1_and_2() {
        ticTacToe.placeX(new Tile(1));
        ticTacToe.placeX(new Tile(2));
        assertEquals("XX3456789", ticTacToe.showBoard());
    }

    @Test
    public void place_o_on_tile_1() {
        ticTacToe.placeO(new Tile(1));
        assertEquals("O23456789", ticTacToe.showBoard());
    }

    @Test
    public void place_o_on_tile_2() {
        Tile tile = new Tile(2);
        ticTacToe.placeO(tile);
        assertEquals("1O3456789", ticTacToe.showBoard());
    }

    @Disabled
    @Test
    public void place_o_on_tile_1_and_2(){
        ticTacToe.placeO(new Tile(1));
        ticTacToe.placeO(new Tile(2));
        assertEquals("OO3456789", ticTacToe.showBoard());
    }

}
