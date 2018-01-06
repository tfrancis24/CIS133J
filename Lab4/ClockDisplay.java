
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes and Tim Francis
 * @version 2017.02.13
 * 
 * - Changed the clock display to the 12hr system and added an am/pm suffix
 * - Added an alarm that can be turned on with a boolean value. When the alarm is turned on,
 * the user can set the time.
 * - Updated the tick method to use the alarm and if the time matches the alarm time, it will
 * ring
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private int alarmHour;
    private int alarmMinutes;
    boolean alarmSwitchOn;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        alarmSwitchOn = false;
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     * This method will buzz the alarm if the alarm is on and the clock time matches the time
     * set on the alarm
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        
        if (alarmSwitchOn) {
            if (hours.getValue() == alarmHour && minutes.getValue() == alarmMinutes) {
                System.out.println("!!!RING!!!");
            }
        }
        
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     * Will display am or pm depending on if the hour is greater than or equal to 12
     */
    private void updateDisplay()
    {
        int hour =  hours.getValue();
        String ampm; // Will store string am or pm depending on the time
        
        //check to determine am or pm
        if (hour >= 12) {
            ampm = "pm"; // time is 12 or later
        } else {
            ampm = "am"; // time is earlier than 12
        }
        
        //Converts 24hr values to 12 hour values
        if (hour >=12) {
            hour -= 12;
        }
        
        //if the hour is "0", then it will change the value of hour to 12
        if (hour == 0) {
            hour = 12;
        }
        
        displayString = hour + ":" + 
                        minutes.getDisplayValue() + ampm; //added string ampm to the display
    }
    
   /**
    * Sets a time for the alarm and turns the switch on
    */ 
    public void turnAlarmOn(int hour, int minutes) {
        alarmHour = hour;
        alarmMinutes = minutes;
        alarmSwitchOn = true;      
    }
    
    /**
     * Sets the alarm swtich off by changing the boolean to false
     */
    public void turnAlarmOff() {
        alarmSwitchOn = false;
    }
}
