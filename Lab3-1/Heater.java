
/**
 * Heater Project
 * Simulate the behaviopr of a heater
 * @author Tim Francis
 * @version 1/25/17
 * Modifications: 
 * - Added 4 int fields for the heater
 * - Added mutators and accessors for the int fields
 * - Created two constructors, one with no params and the other with params specified by the user
 * - Created warmer and cooler methods that adjust the temp based on the increment value unless the temp 
 * exceeds or goes below the max/min
 */
public class Heater {
    private int temperature;
    private int minimum;
    private int maximum;
    private int increment;

    /**
     * Constructor that takes no parameters. Fields set to specified values
     */
    public Heater() {
        minimum = 0;
        maximum = 100;
        increment = 1;
        temperature = 50;
    }

    /**
     * Takes parameters to assign values to the field
     */
    public Heater(int temperature, int minimum, int maximum, int increment) {
        this.temperature = temperature;
        this.minimum = minimum;
        this.maximum = maximum;
        this.increment = increment;
    }

    /**
     * Sets the temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * Sets the minimum int value
     */
    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    /**
     * Sets the maximumint value
     */
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    /**
     * Sets the increment int value
     */
    public void setIncrement(int increment) {
        this.increment = increment;
    }

    /**
     * Gets the temperature from the temperature field
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Returns the minimum int value
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * Returns the maximum int value
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * Returns the increment value
     */
    public int getIncrement() {
        return increment;
    }

    /**
     * Increments the temp by the increment value unless the temp will exceed the max int. Then 
     * an error is printed
     */
    public void warmer() {
        if (temperature + increment <= maximum) {
            temperature += increment;
        } else {
            System.out.println("Error: Temperature cannot go above the max setting");
        }
    }

    /**
     * Decrements the temp by the increment int unless the temp drops below min, then an error prints
     */
    public void cooler() {
        if (temperature - increment >= minimum) {
            temperature -= increment;
        } else {
            System.out.println("Error: Temperature cannot go below the min setting");
        }
    }
}
