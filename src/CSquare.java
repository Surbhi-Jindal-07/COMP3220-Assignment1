/** @author Surbhi Surbhi
 *  @version 1.1
 * 
 * This is an extended Square class of CRectangle
 * A square is a special kind of rectangle with equal sides
 * 
 */

 public class CSquare extends CRectangle {

    private int side; /* side of the square */

    /*
     * Constructor overload for CSquare
     * @param side of square
     * ensures side is a valid values from onset
     */

     public CSquare(int side){
        super(side, side);
        this.side = side;
     }

     /*
     * method to override toString
     */

       public String toString(){
        return getName() + " -> Square of side = " + side +  " has an area = " + String.format("%.2f", calculateArea()) + ".";
       }
    


    

}
