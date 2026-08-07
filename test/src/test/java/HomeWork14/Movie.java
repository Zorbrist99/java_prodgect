package HomeWork14;

public class Movie {
    private String nameFilm;
    private double score;

    public Movie(String nameFilm, double score) {
        this.nameFilm = nameFilm;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "nameFilm='" + nameFilm + '\'' +
                ", score=" + score +
                '}';
    }


}
