import java.util.ArrayList;
/**
 * Data on favorite soda drinks
 * 
 * @author Tim Francis
 * @version 3/13/17
 */
public class FavoriteDrinkData{
    private ArrayList<String> favDrinkData; //arraylist for the favorite drinks
    
    /**
     * Constructor creates array list and calls the method to populate it
     */
    public FavoriteDrinkData() {
        favDrinkData = new ArrayList<String>();
        populateList();
    }
    
    /**
     * Populates list with drinks
     */
    private void populateList() {
        favDrinkData.add("Pepsi");
        favDrinkData.add("Pepsi");
        favDrinkData.add("Pepsi");
        favDrinkData.add("Pepsi");
        favDrinkData.add("Coke");
        favDrinkData.add("Coke");
        favDrinkData.add("Coke");
        favDrinkData.add("Coke");
        favDrinkData.add("Coke");
        favDrinkData.add("Coke");
        favDrinkData.add("Sprite");
        favDrinkData.add("Sprite");
        favDrinkData.add("Sprite");
        favDrinkData.add("Dr.Pepper");
        favDrinkData.add("Dr.Pepper");
        favDrinkData.add("Fanta");
        favDrinkData.add("Fanta");
        favDrinkData.add("Fanta");
        favDrinkData.add("Inca Cola");
        favDrinkData.add("Root Beer");

    }
    
    public ArrayList<String> getData() {
        return favDrinkData;
    }
}
    

