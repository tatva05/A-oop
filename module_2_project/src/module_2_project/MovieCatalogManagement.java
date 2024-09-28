package module_2_project;

import java.util.Collections;

public class MovieCatalogManagement {
    public static void main(String[] args) {
        // Create some movies
        Movie m1 = new Movie("Inception", "Christopher Nolan", 2010, 8.8);
        Movie m2 = new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 9.3);
        Movie m3 = new Movie("The Godfather", "Francis Ford Coppola", 1972, 9.2);

        // Clone a movie
        Movie m4 = m1.clone();
        m4.setTitle("Inception (Clone)");

        // Create movie catalog
        MovieCatalog catalog = new MovieCatalog();
        catalog.addMovie(m1);
        catalog.addMovie(m2);
        catalog.addMovie(m3);
        catalog.addMovie(m4);

        // Display all movies
        System.out.println("All Movies:");
        for (Movie movie : catalog) {
            System.out.println(movie);
        }

        // Sort by rating using Comparable
        Collections.sort(catalog.getMovies());
        System.out.println("\nMovies sorted by rating:");
        for (Movie movie : catalog) {
            System.out.println(movie);
        }

        // Sort by title using Comparator
        catalog.getMovies().sort(new MovieComparator());
        System.out.println("\nMovies sorted by title:");
        for (Movie movie : catalog) {
            System.out.println(movie);
        }
    }
}
