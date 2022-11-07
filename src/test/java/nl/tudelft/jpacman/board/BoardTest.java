package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * Basic implementation of BoardTest.
 *
 * @author Patthita
 */
public class BoardTest {

    private Square[][] grid;
    private Board board;

    private final Square square = new BasicSquare();

    @Test
    void isBoardValid (){
        grid = new Square[][]{
            { square,square}
        };
        board = new Board(grid);
        assertThat(board.invariant()).isEqualTo(true);
    }
    @Test
    void testSquareAt() {
        grid = new Square[][]{
            {square,null}
        };
        board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(square);
    }
}
