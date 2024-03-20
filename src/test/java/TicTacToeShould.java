import com.codurance.TicTacToe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TicTacToeShould {
    @Test
    public void show_empty_board() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals("123456789", ticTacToe.showBoard());
    }

}
