/**
 * A movie in an online movie catalog, such as Netflix
 * 
 * @author Cara Tang and Tim Francis
 * @version 2017.03.03
 */
public class Movie
{
    private String title;
    private int year;  // year the movie was released
    private int starRating; // rating from 1 to 4 stars (0 = not rated yet)

    /**
     * Create a movie with the title, year, and number of stars given
     * @param aTitle the title of the movie
     * @param aYear the year the movie was released
     * @param aStarRating the star rating for the movie
     */
    public Movie(String aTitle, int aYear, int aStarRating)
    {
        title = aTitle;
        year = aYear;
        setStarRating(aStarRating);
    }

    /**
     * Create a movie with the title and year given
     * @param aTitle the title of the movie
     * @param aYear the year the movie was released
     */
    public Movie(String aTitle, int aYear)
    {
        title = aTitle;
        year = aYear;
        starRating = 0;
    }

    /**
     * @return the title of the movie
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @return the year of the movie
     */
    public int getYear()
    {
        return year;
    }
    
    /** 
     * @return the rating in stars of the movie
     */
    public int getStarRating()
    {
        return starRating;
    }
    
    /**
     * Set the star rating of this movie to the value given
     * @param newRating new star rating for the movie
     */
    public void setStarRating(int newRating)
    {
        if (newRating >= 1 && newRating <= 4) {
            starRating = newRating;
        }
        else {
            System.out.println("Error: Valid range for star rating is 1 to 4");
        }
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
        if (starRating < 4) {
            starRating = starRating + 1;
        }
    }

    /**
     * Decrease the star rating of this movie by 1
     */
    public void decreaseStarRating()
    {
        if (starRating > 1) {
            starRating = starRating - 1;
        }
    }

    /**
     * Print information on this movie
     */
    public void printMovieInfo()
    {
        System.out.println("---------------------------------");
        System.out.println(title);
        System.out.println("Year: " + year);
        if (starRating == 0) {
            System.out.println("Rating: (no rating)");
        }
        else {
            System.out.println("Rating: " + starRating + " stars");
        }
        System.out.println("---------------------------------");
    }
}
