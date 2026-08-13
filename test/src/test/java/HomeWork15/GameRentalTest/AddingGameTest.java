package HomeWork15.GameRentalTest;

import HomeWork15.BoardGame;
import HomeWork15.GameRental;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddingGameTest {

    private GameRental gameRental;
    private BoardGame boardGame;

    @BeforeEach
    void beforeEach() {
        gameRental = new GameRental();
        boardGame = new BoardGame("Властелин Колец", 18, 2000);
    }

    @Test
    void addingGameNotOnListTest() {
        gameRental.addingGame(boardGame);

        assertTrue(gameRental.getGames().contains(boardGame),
                "Игра не добавлена в список");
    }

    @Test
    void addingGameToListNameNullTest() {
        try {
            gameRental.addingGame(null);
            fail("Метод должен был выбросить IllegalArgumentException потому что в метод передан null, " +
                    "но метод успешно отработал.");
        } catch (IllegalArgumentException _) {
        }
    }

    @Test
    void addingGameToListIsAlreadyThereTest() {
        try {
            gameRental.addingGame(boardGame);
            gameRental.addingGame(boardGame);
            fail("Метод должен был выбросить IllegalArgumentException потому что в метод передана игра, " +
                    "которая уже есть в спике, но метод успешно отработал.");
        } catch (IllegalArgumentException _) {
        }
    }
}
