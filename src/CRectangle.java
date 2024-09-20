/** @author Surbhi Surbhi
 *  @version 1.1
 * 
 * This is an extended class CRectangle inherited from CShape
 * It has a unique ID and name
 * This class has to implement calculateArea()
 */
public class CRectangle extends CShape {

    private int len; /* length, must be > 0 */
    private int wid; /* breadth, must be > 0 */

    /**
     * Constructor overload for CRectangle
     * @param len the length of the rectangle
     * @param wid the width of the rectangle
     * ensures length and width are valid values from onset
     */

     public CRectangle(int len, int wid){

        if(isValid(len) && isValid(wid)){
            this.len = len;
            this.wid = wid;
        }
        else{
            this.len = 1; //makes incorrect user input to 1
            this.wid = 1; //makes incorrect user input to 1
        }
     }
    /*
     * method to validate a positve value for side
     * @param s a side to be tested
     * @return true if valid else false (<0)
     */

     private boolean isValid(int s){
        return(s>0)?true:false;
     }

     /* method override to calculate area from CShape
      * @return area of rectangle
      */
      public double calculateArea(){
        return len*wid;
      }

      /*
       * method to override toString
       */

       public String toString(){
        return getName() + " -> Rectangle of length = " + len + " and width = " + wid + " has an area = " + String.format("%.2f", calculateArea()) + ".";
       }
    
}
