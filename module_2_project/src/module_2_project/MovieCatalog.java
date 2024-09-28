package module_2_project;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieCatalog implements Iterable<Movie> {
    private List<Movie> movies;

    // Constructor
    public MovieCatalog() {
        movies = new ArrayList<>();
    }

    // Add a movie to the catalog
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Remove a movie from the catalog
    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    // Get the list of movies
    public List<Movie> getMovies() {
        return movies;
    }

    // Implement the iterator method
    @Override
    public Iterator<Movie> iterator() {
        return movies.iterator();
    }
}
