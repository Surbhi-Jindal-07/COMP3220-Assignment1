/** @author Surbhi Surbhi
 *  @version 1.1
 * 
 * This is an extended Circle class of COval
 * A circle is a special kind of oval with equal horizontal and vertical radius
 * 
 */
public class CCircle extends COval {
    private int radius; //radius of the circle

     /*
     * Constructor overload for CCircle
     * @param radius of square
     * ensures radius is a valid values from onset
     */
    public CCircle(int radius){
        super(radius, radius);
        this.radius = radius;
    }

    /*
     * method to override toString
     */

     public String toString(){
        return getName() + " -> Circle of radius = " + radius +  " has an area = " + String.format("%.2f", calculateArea()) + ".";
       }
    

}
