package HomeWork15.GameRentalTest;

import HomeWork15.BoardGame;
import HomeWork15.GameRental;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindGameTest {
    private GameRental gameRental;
    private BoardGame boardGame;

    @BeforeEach
    void beforeEach() {
        gameRental = new GameRental();
        boardGame = new BoardGame("Властелин Колец", 18, 2000);
    }

    @Test
    void findGameByExistingNameTest() {
        gameRental.addingGame(boardGame);

        assertEquals(boardGame, gameRental.findGameByTitle("Властелин Колец"),
                "Игры с названием Властелин Колец не найдено в списке");
    }

    @Test
    void findGameByNonExistentNameReturnsNullTest() {

        assertNull(gameRental.findGameByTitle("Властелин Колец"),
                "Игра с названием: Властелин Колец присутствует в списке");
    }
}
