package HomeWork15.GameRentalTest;

import HomeWork15.BoardGame;
import HomeWork15.GameRental;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RentGameTest {
    private GameRental gameRental;
    private BoardGame boardGame;

    @BeforeEach
    void beforeEach() {
        gameRental = new GameRental();
        boardGame = new BoardGame("Властелин Колец", 18, 2000);
    }

    @Test
    void findGameByNonExistentNameTest() {
        try {
            gameRental.rentGame("Властелин Колец", 15);
            fail("Метод должен был выбросить IllegalArgumentException если игры не существует, " +
                    "но метод успешно отработал.");
        } catch (IllegalArgumentException _) {
        }
    }

    @Test
    void shouldReturnFalseWhenAgeIsNotSuitableTest() {
        gameRental.addingGame(boardGame);

        assertFalse(gameRental.rentGame("Властелин Колец", 15),
                "Метод вернул true, хотя клиент не подходит по возрасту");
    }

    @Test
    void falseIfAlreadyRentedTest() {
        boardGame.setGameRented(true);
        gameRental.addingGame(boardGame);

        assertFalse(gameRental.rentGame("Властелин Колец", 18),
                "Метод вернул true, хотя игра забронирована");
    }

    @Test
    void trueIfRentSuccessTest() {
        gameRental.addingGame(boardGame);

        assertTrue(gameRental.rentGame("Властелин Колец", 19),
                "Ожидалось, что метод вернет true, поскольку название и возраст подходят под условия");
        assertTrue(boardGame.isGameRented(),
                "Ожидалось, что ира изменит статус на зарезервирована");
    }
}
