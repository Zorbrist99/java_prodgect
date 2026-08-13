package HomeWork15.GameRentalTest;

import HomeWork15.BoardGame;
import HomeWork15.GameRental;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResetGameRentalTest {

    private GameRental gameRental;
    private BoardGame boardGame;
    private BoardGame boardGame1;

    @BeforeEach
    void beforeEach() {
        gameRental = new GameRental();
        boardGame = new BoardGame("Властелин Колец", 18, 2000);
        boardGame1 = new BoardGame("Пираты морей", 15, 500);
    }

    @Test
    void returnsAllGamesTest() {

        boardGame1.setGameRented(true);
        boardGame.setGameRented(true);

        gameRental.addingGame(boardGame);
        gameRental.addingGame(boardGame1);

        assertTrue(gameRental.getGames().getFirst().isGameRented(),
                "Ожидалось что игра забронирована");
        assertTrue(gameRental.getGames().get(1).isGameRented(),
                "Ожидалось что игра забронирована");

        gameRental.reset();

        assertFalse(gameRental.getGames().getFirst().isGameRented(),
                "Ожидалось что игра перестала быть забронирована");
        assertFalse(gameRental.getGames().get(1).isGameRented(),
                "Ожидалось что игра перестала быть забронирована");
    }

    @Test
    void statusUnchangedIfGameMissingTest() {

        assertFalse(boardGame.isGameRented(),
                "Ожидалось что игра не была забронирована");

        gameRental.reset();

        assertFalse(boardGame.isGameRented(),
                "Ожидалось что игра не была забронирована");
    }
}
