package HomeWork15.BoardGameTest;

import HomeWork15.BoardGame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class BoardGameTest {

    static Object[][] providerData() {
        return new Object[][]{
                {"", 18, 2000},
                {"Пираты на странных берегах", -18, 2000},
                {"Пираты на странных берегах", 18, 0},
                {"Пираты на странных берегах", 18, -200}
        };
    }

    @Test
    void successfulObjectCreationTest() {
        BoardGame boardGame = new BoardGame("Властелин Колец", 18, 2000);

        assertEquals("Властелин Колец", boardGame.getGameName(),
                "У объекта поле gameName не сходится с ожидаемым");
        assertEquals(18, boardGame.getMinAgePlayer(),
                "У объекта поле minAgePlayer не сходится с ожидаемым");
        assertEquals(2000, boardGame.getCostRentOneDay(),
                "У объекта поле costRentOneDay не сходится с ожидаемым");
    }

    @ParameterizedTest
    @MethodSource("providerData")
    void validObjectCreationTest(String nameGame, int minAgePlayer, int costRentOneDay) {
        try {
            new BoardGame(nameGame, minAgePlayer, costRentOneDay);

            fail("Конструктор должен был выбросить IllegalArgumentException, но объект успешно создался!");

        } catch (IllegalArgumentException _) {
        }
    }

    @Test
    void creatingObjectWithNullNameTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                new BoardGame(null, 18, 2000));

        assertEquals("Название игры не может быть null или пустым", exception.getMessage());
    }

    @Test
    void playerAgeFallsAgeLimits() {
        BoardGame boardGame = new BoardGame("Властелин Колец", 18, 2000);

        assertFalse(boardGame.canBeRentedBy(17), "Ожидаем получить false, " +
                "если возраст клиента меньше указанного при создании объекта BoardGame");
    }

    @Test
    void playerAgeTrueAgeLimits() {
        BoardGame boardGame = new BoardGame("Властелин Колец", 18, 2000);

        assertTrue(boardGame.canBeRentedBy(18), "Ожидаем получить true, " +
                "если возраст клиента больше или равен указанного при создании объекта BoardGame");
        assertTrue(boardGame.canBeRentedBy(19), "Ожидаем получить true, " +
                "если возраст клиента больше или равен указанного при создании объекта BoardGame");
    }
}
