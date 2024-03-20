import com.codurance.TicTacToe;
import com.codurance.Tile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TicTacToeShould {
    @Test
    public void show_empty_board() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals("123456789", ticTacToe.showBoard());
    }

    @Test
    public void place_1_x_on_tile_1() {
        TicTacToe ticTacToe = new TicTacToe();
        Tile tile = new Tile(1);
        ticTacToe.placeX(tile);
        assertEquals("X23456789", ticTacToe.showBoard());
    }

    @Test
    public void place_x_on_tile_2() {
        TicTacToe ticTacToe = new TicTacToe();
        Tile tile = new Tile(2);
        ticTacToe.placeX(tile);
        assertEquals("1X3456789", ticTacToe.showBoard());
    }

    @Test
    public void place_x_on_tile_1_and_2() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.placeX(new Tile(1));
        ticTacToe.placeX(new Tile(2));
        assertEquals("XX3456789", ticTacToe.showBoard());
    }

    @Test
    public void place_o_on_tile_1() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.placeO(new Tile(1));
        assertEquals("O23456789", ticTacToe.showBoard());
    }

}
