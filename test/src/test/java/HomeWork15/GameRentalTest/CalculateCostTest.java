package HomeWork15.GameRentalTest;

import HomeWork15.BoardGame;
import HomeWork15.GameRental;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculateCostTest {

    private static GameRental gameRental;
    private static BoardGame boardGame;

    @BeforeAll
    static void beforeAll() {
        gameRental = new GameRental();
        boardGame = new BoardGame("Властелин Колец", 18, 2000);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0",
            "-10"
    })
    void exceptionIfAgeLessOrEqualZero(int days) {
        try {
            gameRental.calculateCost("Властелин", days);

            fail("Метод должен был выбросить IllegalArgumentException если количество дней аренды меньше или равно 0," +
                    "но метод успешно отработал.");
        } catch (IllegalArgumentException _) {
        }
    }

    @Test
    void exceptionIfGameMissingTest() {
        try {
            gameRental.addingGame(boardGame);
            gameRental.calculateCost("Властелин", 10);

            fail("Метод должен был выбросить IllegalArgumentException если игры не существует, " +
                    "но метод успешно отработал.");
        } catch (IllegalArgumentException _) {
        }
    }

    @Test
    void correctPriceCalculationGameTest() {
        gameRental.addingGame(boardGame);

        assertEquals(10000, gameRental.calculateCost("Властелин Колец", 5),
                "Ожидалось, что сумма аренды будет равна 10.000. Из расчета days*costRentOneDay ");

    }
}
