package HomeWork15;

public class BoardGame {

    private String gameName;
    private int minAgePlayer;
    private int costRentOneDay;
    private boolean gameRented;

    public BoardGame(String gameName, int minAgePlayer, int costRentOneDay) {
        if (gameName == null || gameName.isEmpty()) {
            throw new IllegalArgumentException("Название игры не может быть null или пустым");
        }
        this.gameName = gameName;

        if (minAgePlayer < 0) {
            throw new IllegalArgumentException("Возраст игрока не может быть меньше нуля");
        }
        this.minAgePlayer = minAgePlayer;


        if (costRentOneDay <= 0) {
            throw new IllegalArgumentException("Стоимость аренды не может быть меньше или равна нулю");
        }
        this.costRentOneDay = costRentOneDay;
    }

    public String getGameName() {
        return gameName;
    }

    public int getMinAgePlayer() {
        return minAgePlayer;
    }

    public int getCostRentOneDay() {
        return costRentOneDay;
    }

    public void setGameRented(boolean gameRented) {
        this.gameRented = gameRented;
    }

    public boolean isGameRented() {
        return gameRented;
    }

    public boolean canBeRentedBy(int age) {
        return age >= minAgePlayer;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "gameName='" + gameName + '\'' +
                ", minAgePlayer=" + minAgePlayer +
                ", costRentOneDay=" + costRentOneDay +
                ", gameRented=" + gameRented +
                '}';
    }
}
