package HomeWork15;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameRental {

    private List<BoardGame> games = new ArrayList<>();

    public List<BoardGame> getGames() {
        return games;
    }

    public void addingGame(BoardGame game) {
        if (game == null) {
            throw new IllegalArgumentException("Настольная игра должна иметь название");
        }
        for (BoardGame s : games) {
            if (game.getGameName().equals(s.getGameName())) {
                throw new IllegalArgumentException("Настольная игра c таким названием уже существует");
            }
        }

        games.add(game);
    }

    public BoardGame findGameByTitle(String gameName) {
        for (BoardGame s : games) {
            if (s.getGameName().equals(gameName)) {
                return s;
            }
        }
        return null;
    }

    public boolean rentGame(String gameName, int customerAge) {
        for (BoardGame s : games) {
            if (gameName.equals(s.getGameName()) && customerAge < s.getMinAgePlayer()) {
                return false;
            }
            if (gameName.equals(s.getGameName()) && s.isGameRented()) {
                return false;
            }
            if (gameName.equals(s.getGameName())) {
                s.setGameRented(true);
                return true;
            }
        }
        throw new IllegalArgumentException("Игры с таким названием нет в коллекции");
    }

    public boolean returnGame(String name) {
        for (BoardGame s : games) {
            if (s.getGameName().equals(name) && !s.isGameRented()) {
                return false;
            } else {
                s.setGameRented(false);
                return true;
            }

        }
        return false;
    }

    public int calculateCost(String name, int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("Количество дней аренды не может быть меньше или равно 0");
        }
        for (BoardGame s : games) {
            if (s.getGameName().equals(name)) {
                return s.getCostRentOneDay() * days;
            }
        }
        throw new IllegalArgumentException("Данной игры нет в списке");
    }

    public void reset(){
        for (BoardGame s: games){
            s.setGameRented(false);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameRental that = (GameRental) o;
        return Objects.equals(games, that.games);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(games);
    }
}
