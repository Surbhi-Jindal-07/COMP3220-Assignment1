/** @author Surbhi Surbhi
 * @version 1.1
 * 
 * This is an abstract class CShape which is parent for all other children/sub-classes
 * Every shape has a unique ID and name
 * Every shape can be used to calculate area
 */

public abstract class CShape {
    private int id;                     /** unique id */
    private static int counter = 0;    /** shared attribute for all instances of CShape */
    private String name;               /** non-empty */

    /** default constructor
     * initializes id and name to next unique int counter
     * */

    public CShape() {
        id = ++counter;
        name = "shape" + id;
    }
    /** overload constructor
     * allows user to set name
     * cannot be empty
     * */
    public CShape(String name){
        this();                             //invoke default constructor first
        if(name.trim().length() > 0){       //ensure name is not blank or whitespace
            this.name = name.trim();
        }
    }
    /**
     * access method for id
     * @return id
     */

    public int getId(){
        return id;
    }

    /**
     * access method for name
     * @return name
     */

    public String getName(){
        return name;
    }

    /*
    * abstarct method to calculateArea()
    * must be implemented by all the derived classes
    * polymorphism
    */
    public abstract double calculateArea();
    /**
     * ovveride method to represent the shape in string form
     * @return string representation of the shape
     */

    public String toString(){
        return name;
    }

}
