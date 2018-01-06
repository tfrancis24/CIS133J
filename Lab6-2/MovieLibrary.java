import java.util.ArrayList;
/**
 * A library of movies
 * 
 * @author Cara Tang and Tim Francis
 * @version 2017.03.03
 * - added movie objects to the constructor
 * - added findMovieByTitle method
 * - added removeMovie method
 * - added getMovieWithStarRating method
 * - added printRatingReport method
 */
public class MovieLibrary
{
    private ArrayList<Movie> movies;

    /**
     * Create a movie library and initialize it with a few movies
     */
    public MovieLibrary()
    {
        movies = new ArrayList<Movie>();
        addMovie("Star Wars", 1977, 4);
        addMovie("Ben Hur", 1959, 4);
        addMovie("Fantasia", 1940);
        addMovie("Casino Royale", 2006);
        addMovie("Movie 1", 1955, 3);
        addMovie("Some random movie", 1920, 4);
        addMovie("Bad Movie", 1222, 3);
        addMovie("Some Movie", 1920, 1 );
    }

    /**
     * Add a movie to the library
     * @param title the movie title
     * @param year the year the movie was released
     */
    public void addMovie(String title, int year)
    {
        movies.add(new Movie(title, year));
    }

    /**
     * Add a movie to the library
     * @param title the movie title
     * @param year the year the movie was released
     * @param starRating rating for the movie in stars (1, 2, 3, or 4)
     */
    public void addMovie(String title, int runLength, int starRating)
    {
        movies.add(new Movie(title, runLength, starRating));
    }

    /**
     * @return the number of movies in this library
     */
    public int getNumberOfMovies()
    {
        return movies.size();
    }

    /**
     * Removes all the movies in the library
     */
    public void clearLibrary()
    {
        movies.clear();
    }

    /**
     * @param title title of the movie to search for
     * @return the movie with the given title 
     *         or null if there is no movie in the library with that title
     */
    public Movie findMovieByTitle(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return movie; //return the movie object with the matching title
            }
        }
        return null; //if no movie found
    }

    /**
     * Removes a movie object from the list with the matching title
     * @param title title of movie to remove
     */
    public void removeMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                movies.remove(movie);
                System.out.println("Removed " + title);
                break;
            }
        }
    }

    /**
     * Searches through the movie list to find movies with a given star rating, then adds them to a new list
     * @param rating rating of movies user is looking for
     * @return list of movies with the given star rating
     */
    public ArrayList<Movie> getMovieWithStarRating(int rating) {
        ArrayList<Movie> starList = new ArrayList<Movie>();
        for (Movie movie : movies) {
            if (movie.getStarRating() == rating) {
                starList.add(movie);
            }
        }
        return starList;
    }

    /**
     *  Print the total number of movies with each type of star rating 
     */
    public void printRatingReport() {
        int fourCount = 0;
        int threeCount = 0;
        int twoCount = 0;
        int oneCount = 0;
        int unratedCount = 0;
        for (Movie movie : movies) {
            if (movie.getStarRating() == 4){
                fourCount++;
            } else if (movie.getStarRating() == 3) {
                threeCount++;
            } else if (movie.getStarRating() == 2) {
                twoCount++;
            } else if (movie.getStarRating() == 1) {
                oneCount++;
            } else {
                unratedCount++;
            }
        }
        System.out.println("Four Star Movies: " + fourCount);
        System.out.println("Three Star Movies: " + threeCount);
        System.out.println("Two Star Movies: " + twoCount);
        System.out.println("One Star Movies: " + oneCount);
        System.out.println("Unrated Movies: " + unratedCount);
    }

    /**
     * Print the movies in the library
     */
    public void printMovies(){
        {
            System.out.println("##########################################");
            System.out.println("MOVIE LIBRARY:");
            if (movies.size() == 0) {
                System.out.println("No movies in the library");
            }
            else {
                for (Movie movie : movies) {
                    movie.printMovieInfo();
                }
            }
            System.out.println("##########################################");
        }
    }
}
