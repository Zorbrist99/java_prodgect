package HomeWork15.GameRentalTest;

import HomeWork15.BoardGame;
import HomeWork15.GameRental;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReturnGameTest {

    private GameRental gameRental;
    private BoardGame boardGame;

    @BeforeEach
    void beforeEach() {
        gameRental = new GameRental();
        boardGame = new BoardGame("Властелин Колец", 18, 2000);
    }

    @Test
    void falseIfGameMissingTest() {
        assertFalse(gameRental.returnGame("Спящая красавица"),
                "Ожидалось, что метод вернет false поскольку такой игры нет в списке");
    }

    @Test
    void falseIfNotRentedTest() {
        gameRental.addingGame(boardGame);

        assertFalse(gameRental.returnGame("Властелин Колец"),
                "Ожидалось, что метод вернет false поскольку эта игра не была забронирована");
    }

    @Test
    void trueIfReturnSuccessTest() {
        boardGame.setGameRented(true);
        gameRental.addingGame(boardGame);

        assertTrue(gameRental.returnGame("Властелин Колец"),
                "Ожидалось, что метод вернет true поскольку эта игра была забронирована");
    }
}
