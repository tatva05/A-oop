package module_2_project;

public class Movie implements Comparable<Movie>, Cloneable {
    private String title;
    private String director;
    private int year;
    private double rating;

    public Movie(String title2, String director2, int year2, double rating2) {
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Implement Comparable interface for sorting by rating
    @Override
    public int compareTo(Movie other) {
        return Double.compare(this.rating, other.rating);
    }

    // Implement Cloneable interface
    @Override
    public Movie clone() {
        try {
            return (Movie) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Override toString() method for easy display
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }
}
