/**
 * Class to reprsent a russian nesting doll
 */
public class Doll {
    public int size;

    /**
     * Constructor for Doll class
     * @param mSize size, in whole centimeters, of the doll
     */
    public Doll(int mSize) {
        this.size = mSize; // initializes size
    }

    /**
     * Function to full unbox a Russian nesting doll of any positive size
     * @param doll initial doll to unbox
     * @return the smallest doll, of size 0
     */
    public static Doll unbox(Doll doll) {
        int mySize = doll.size;;
        // base case, when the smallest doll is reached
        if (mySize == 0) {
            // returns the final, smallest doll object
            return doll;
        }
        // unboxes current doll to get the child doll
        Doll childDoll = new Doll(mySize - 1);
        // recursive function call: unboxes the next doll
        return unbox(childDoll);
    }
}
