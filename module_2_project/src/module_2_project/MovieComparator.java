package module_2_project;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getTitle().compareTo(m2.getTitle());
    }
}
