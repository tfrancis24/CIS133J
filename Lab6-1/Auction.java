import java.util.ArrayList;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kölling and Tim Francis
 * @version 2017.02.27
 * - Added a close method
 * - Added a getUnsold method
 * - Changed the getLot method to use a for loop
 * - Added a removeLot method
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }

    /**
     * Make a bid for a lot.
     * A message is printed indicating whether the bid is
     * successful or not.
     * 
     * @param lotNumber The lot being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void makeABid(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            Bid bid = new Bid(bidder, value);
            boolean successful = selectedLot.bidFor(bid);
            if(successful) {
                System.out.println("The bid for lot number " +
                    lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                    " already has a bid of: " +
                    highestBid.getValue());
            }
        }
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        for (Lot lot : lots) {
            if (lot.getNumber() == lotNumber) {
                return lot;
            } else if(lot.getNumber() > lotNumber) {
                System.out.println("Lot number: " + lotNumber +
                    " does not exist."); 
                return null;
            }
        }
        return null;

    }

    /**
     * Prints a message about a lots bidder and value of the winning bid
     * If it has no bidder, says the lot has no bids
     */
    public void close() {
        for (Lot lot: lots) {
            Bid bid = lot.getHighestBid();
            if (bid == null) {
                System.out.println("There was no bidder for lot " + lot.getNumber());
            } else {
                Person person = bid.getBidder();
                System.out.println("The winning bidder was " + person.getName());
                System.out.println("The highest bid was " + lot.getHighestBid().getValue());
            }
        }
    }

    /**
     * Return a list of unsold lots
     */
    public ArrayList<Lot> getUnsold() {
        ArrayList<Lot> unsold = new ArrayList<Lot>();
        for (Lot lot : lots) {
            Bid bid = lot.getHighestBid();
            if (bid == null) {
                unsold.add(lot);
            }
        }
        return unsold;
    }

    /**
     * Remove the lot with the given lot number
     * @param number the number of the lot to be removed
     * @return the lot with the given number, or null if
     * there is no such lot
     */
    public Lot removeLot(int number) {
        Lot lot = getLot(number);
        if (lot != null) {
            lots.remove(lot);
        }
        return lot;
    }
}
