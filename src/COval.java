/** 
 * @author Surbhi Surbhi
 * @version 1.1
 * 
 * This class represents an oval shape, inheriting from CShape.
 * An oval has horizontal and vertical radii.
 */

 public class COval extends CShape{

    private int horRad;     /* horizontal radius */
    private int verRad;     /* vertical radius */

    /** 
     * Constructor for COval 
     * @param horRad the horizontal radius of the oval
     * @param verRad the vertical radius of the oval
     * ensures both radii are valid values
     */
    public COval(int horRad, int verRad) {
      
        if (isValid(horRad) && isValid(verRad)) {
            this.horRad = horRad;
            this.verRad = verRad;
        } else {
            this.horRad = 1;   // default value to 1 if invalid input
            this.verRad = 1;     // default value to 1 if invalid input
        }
    }

    /**
     * Method to validate a positive value for radius.
     * @param r radius to be tested
     * @return true if valid, else false
     */
    private boolean isValid(int r) {
        return(r>0)?true:false;
    }

    /* method override to calculate area from CShape
      * @return area of oval
      */
    public double calculateArea() {
        double area = 3.14 * horRad * verRad;
        return area;
    }

    /*
     * method to override toString
    */
    public String toString() {
        return getName() + " -> Oval of horizontal radius = " + horRad + " and vertical radius = " + verRad + " has an area = " + String.format("%.2f", calculateArea()) + ".";
    }
}
