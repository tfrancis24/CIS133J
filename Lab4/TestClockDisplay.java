
/**
 * Class for testing times on the clock display
 * 
 * @author Tim Francis 
 * @version (2/13/17)
 */
public class TestClockDisplay
{

    /**
     * Constructor for objects of class TestClockDisplay
     */
    public TestClockDisplay(){
    }
    
    /**
     * Testing display method
     */
    public void test() {
        ClockDisplay clock = new ClockDisplay();
        
        clock.setTime(22, 30);
        System.out.println(clock.getTime());        
        
        clock.setTime(10, 30);
        System.out.println(clock.getTime());
        
        clock.setTime(00, 00);
        System.out.println(clock.getTime());
        
        clock.setTime(12, 00);
        System.out.println(clock.getTime());
    }

}
