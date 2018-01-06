/**
 * A movie in an online movie catalog, such as Netflix
 * 
 * @author Cara Tang and Tim Francis
 * @version 2017.02.17
 * 
 * Lab 2 Modifications:
 * - added second constructor
 * - added getStarRating
 * - added setStarRating
 * - fixed increaseStarRating
 * - added decreaseStarRating
 * - updated printMovieInfo
 * Lab 3-2 Modifications:
 * - Changed the constructor so that aStarRating is passed as a parameter for the setStarRating function.
 * - Updated the setStarRating method so that it only accepts int values between 1-4. Error msg printed otherwise
 * - Updated the increaseStarRating method so it wont increase the rating above 4
 * - Updated the decreaseStarRating so it wont allow the value to go below 0
 * - Updated printMovieInfo to print a no rating msg if the starRating is 0.
 * 
 */
public class Movie
{
    private String title;
    private int year;  // year the movie was released
    private int starRating; // rating from 1 to 4 stars (0 = not rated yet)

    /**
     * Create a movie with the title, year, and number of stars given. Uses setStarRating method to set the rating.
     */
    public Movie(String aTitle, int aYear, int aStarRating)
    {
        title = aTitle;
        year = aYear;
        setStarRating(aStarRating);
        // Question: Why do you think we want to replace the assignment statement with a call to setStarRating?
        // Your Answer:The function already performs what the previous line of code wanted us to do, set the rating through the function.
    }

    /**
     * Create a movie with the title and year given
     */
    public Movie(String aTitle, int aYear)
    {
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
     * Return the year the movie was released
     */
    public int getYear()
    {
        return year;
    }

    /** 
     * Return the rating in stars of the movie
     */
    public int getStarRating()
    {
        return starRating;
    }

    /**
     * Set the star rating of this movie to the value given. Will only accept values between 1 and 4
     */
    public void setStarRating(int newRating)
    {
        if (newRating >= 1 && newRating <= 4){
            starRating = newRating;
        } else {
            System.out.println("Error: The valid range must be between 1-4");
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
     * Increase the star rating of this movie by 1. Will do nothing if the rating is greater than 4.
     */
    public void increaseStarRating()
    {
        if (starRating < 4) {
            starRating++;
        }
    }

    /**
     * Decrease the star rating of this movie by 1. Will not allow a decrease if the rating is less than 1.
     */
    public void decreaseStarRating()
    {

       if (starRating > 1) {
           starRating--;
       }
    }

    /**
     * Print information on this movie. Will print "no rating" if the starRating value is 0.
     */
    public void printMovieInfo()
    {
        System.out.println("---------------------------------");
        System.out.println(title);
        System.out.println("Year: " + year);
        if (starRating == 0) {
            System.out.println("Rating: (no rating)");
        } else {
            System.out.println("Rating: " + starRating + " stars");
        }
        System.out.println("---------------------------------");
    }
}
