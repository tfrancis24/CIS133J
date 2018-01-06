/**
 * A movie in an online movie catalog, such as Netflix
 * 
 * @author Cara Tang and Tim Francis
 * @version 1/18/17
 * - Added a new constructor
 * - Added a getStarRating method
 * - Added a setStartRating method
 * - Fixed increaseStarRating method
 * - Added a decreaseStarRating method
 * - Changed the printMovieInfo so it prints the movies star rating as well
 *                           
 */
public class Movie
{
    private String title;
    private int year;  // year the movie was released
    private int starRating; // rating from 1 to 4 stars (0 = not rated yet)

    /**
     * Create a movie with the title, year, and number of stars given
     */
    public Movie(String aTitle, int aYear, int aStarRating)
    {
        title = aTitle;
        year = aYear;
        starRating = aStarRating;
    }
    
    /**
     * Creates a movie with the title and year only
     * Star rating is set to 0
     */
    public Movie(String aTitle, int aYear) {
        title = aTitle;
        year = aYear;
        starRating = 0;
    }

    /**
     * Return the title of the movie
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the year the movie was releaed
     */
    public int getYear()
    {
        return year;
    }
    
    /**
     * Gets the start rating from the movie object
     */
    public int getStarRating() {
        return starRating;
    }

    public void setStartRating(int newStarRating) {
        starRating = newStarRating;
    }
    
    /**
     * Reset the star rating of this movie to 0, meaning not rated
     */
    public void resetStarRating()
    {
        starRating = 0;
    }
    
    /**
     * Increase the star rating of this movie by 1
     */
    public void increaseStarRating()
    {
        starRating += 1;
    }


    /**
     * Will decrease a movies star rating by 1
     */
    public void decreaseStarRating() {
        starRating -= 1;
    }

    /**
     * Print information on this movie
     */
    public void printMovieInfo()
    {
        System.out.println("---------------------------------");
        System.out.println(title);
        System.out.println("Year: " + year);
        System.out.println("Star Rating: " + starRating);
        System.out.println("---------------------------------");
    }
}
