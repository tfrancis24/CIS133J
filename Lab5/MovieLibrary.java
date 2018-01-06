import java.util.ArrayList;
/**
 * Write a description of class MovieLibrary here.
 * 
 * @author Tim Francis 
 * @version 2/17/17
 * - Added a constructor that creates a list of movies
 * - Added a getter for the movie list. Returns number of movie objects in list
 * - Added an addMovie method that allows the user to add movie objects to list
 * - Added print movie method that prints info about the movie objects
 *
 */
public class MovieLibrary
{
    // instance variables - replace the example below with your own
    private ArrayList<Movie> mList;//ArrayList of movie objects declared

    /**
     * Contructor that  creates an array list of movies with no params
     */
    public MovieLibrary() {
        mList = new ArrayList<Movie>();
    }

    /**
     * Creates a new movie object using the params passed in
     * Then adds that movie object to the list
     * @param title, the title of the movie for the movie object
     * @param year the year of the movie for the movie object
     */
    public void addMovie(String title, int year) {
        Movie movie = new Movie(title, year);
        mList.add(movie);
    }

    /**
     * Returns an int for the number of movies currently in the library
     */
    public int getNumberOfMovies() {
        return mList.size();
    }

    /**
     * Prints a msg if no moves in the library, otherwise it prints a msg about each of the movies
     * (year, title)
     */
    public void printMovies() {
        if (getNumberOfMovies() == 0) {
            System.out.println("There are no movies in the library");
        } else {
            for (Movie movie : mList) {
                System.out.println("#################");
                System.out.println("Movie Title: " + movie.getTitle());
                System.out.println("Year Released: " + movie.getYear());
                System.out.println("#################");
            }
        } 
    }

}
