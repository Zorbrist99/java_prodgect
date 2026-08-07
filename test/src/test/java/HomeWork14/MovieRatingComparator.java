package HomeWork14;



import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie> {


    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getScore(), o2.getScore());
    }
}
