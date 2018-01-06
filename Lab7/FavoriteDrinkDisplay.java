import java.util.ArrayList;
/**
 * Display data from the data class into a histogram
 * 
 * @author Tim Francis
 * @version 3/13/17
 */
public class FavoriteDrinkDisplay{
    private ArrayList<String> drinkData;
    private int[] drinkCount;

    /**
     * Constructor for the FavoriteDrinkDisplay Object
     */
    public FavoriteDrinkDisplay() {
        FavoriteDrinkData data = new FavoriteDrinkData();
        drinkData = data.getData();
        countData();      
    }

    /**
     * Records the counts of the drink data using an array
     */
    private void countData() {
        drinkCount = new int[7]; // 7 types of drinks from the data
        for (String drink : drinkData) {
            if (drink.equals("Pepsi")) {
                drinkCount[0]++;
            } else if (drink.equals("Coke")) {
                drinkCount[1]++;
            } else if (drink.equals("Sprite")) {
                drinkCount[2]++;
            } else if (drink.equals("Dr.Pepper")) {
                drinkCount[3]++;
            } else if (drink.equals("Fanta")) {
                drinkCount[4]++;
            } else if (drink.equals("Inca Cola")) {
                drinkCount[5]++;
            } else if (drink.equals("Root Beer")) {
                drinkCount[6]++;
            }
        }
    }
    
    /**
     * Displays the data as a histogram
     * Calls the printSymbol method each time to display the symbols for the histogram
     */
    public void displayData() {
        System.out.println("Drink Data Histogram\n");
        System.out.print("Pepsi:       " + drinkCount[0]);
        printSymbol(drinkCount[0]);
        System.out.print("Coke:        " + drinkCount[1]);
        printSymbol(drinkCount[1]);
        System.out.print("Sprite:      " + drinkCount[2]);
        printSymbol(drinkCount[2]);
        System.out.print("Dr.Pepper    " + drinkCount[3]);
        printSymbol(drinkCount[3]);
        System.out.print("Fanta:       " + drinkCount[4]);
        printSymbol(drinkCount[4]);
        System.out.print("Inca Color:  " + drinkCount[5]);
        printSymbol(drinkCount[5]);
        System.out.print("Root Beer:   " + drinkCount[6]);
        printSymbol(drinkCount[6]);
        
    }
    
    /**
     * This method prints some blank space, a new line, and the symbol to use for the histogram
     */
    private void printSymbol(int count) {
        System.out.print("  ");
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }    
}
