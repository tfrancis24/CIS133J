
/**
 * Demonstrate the use of variables
 * 
 * @author Tim Francis
 * @version 1/18/17
 */
public class VariablesDemo {
    private int feet;
    private String season;
   /*
    * Constructor for objects of class VariablesDemo
    */ 
    public VariablesDemo() {
        feet = 5;//assigning a value to a variable
        season = "Winter";
        
        int x = 42; //local variable. This can only be used inside the constructor
    }
    
    /*
     * Demonstrate calculations with variables
     */
    public void calculate(int newFeet) {
        feet = newFeet;
        int inches = feet * 12;
        System.out.println(feet + " feet = " + inches + " inches");
        System.out.println("The season is " + season); //print the value of a variable
        
        int x = 0; //local variable different than the x from above
        x = x + 1;//add 1 to the value
        x = x * 5 * x;
        x = x * x;
        x = 10 - x;
        System.out.println("'x' is " + x);// will print x is -15
    }
}
