import java.util.*;

/** @author Surbhi Surbhi
 * @version 1.1
 * 
 * This is a canvas class that will generate random shapes
*/

 public class CCanvas {
    private ArrayList<CShape> shapes;

/**
 * Default constructor for CCanvas.
 * Initializes the list of shapes and generates random shapes for the canvas.
*/
    public CCanvas() {
        shapes = new ArrayList<>(); // Initializes the ArrayList to hold Shape objects
        generateRandomShapes();     // Calls the method to generate 10 random, unique shape
    }

    /**
     * Generate 10 random, non-duplicate shapes and add them to the canvas.
     */
    /**
 * Method to generate 10 random and unique shapes.
 * Uses a Random object to randomly choose the type of shape and assign random dimensions.
 * Ensures that no duplicate shapes (same dimensions) are added to the list.
 */
private void generateRandomShapes() {
    Random rand = new Random(); // Random object for generating random numbers
    Set<String> uniqueShapes = new HashSet<>(); // Set to store unique shapes to prevent duplicates

    // Keep generating shapes until the list contains 10 unique shapes
    while (shapes.size() < 10) {
        int shapeType = rand.nextInt(4);  // Randomly selects a shape type (0: Rectangle, 1: Square, 2: Circle, 3: Oval)
        CShape shape = null;

        switch (shapeType) {
            case 0:
                // Generate random dimensions for a rectangle
                int length = rand.nextInt(100) + 1;  // Random length between 1 and 100
                int width = rand.nextInt(100) + 1;   // Random width between 1 and 100
                shape = new CRectangle(length, width);
                break;
            case 1:
                // Generate random side length for a square
                int side = rand.nextInt(100) + 1;  // Random side length between 1 and 100
                shape = new CSquare(side);
                break;
            case 2:
                // Generate random radius for a circle
                int radius = rand.nextInt(100) + 1;  // Random radius between 1 and 100
                shape = new CCircle(radius);
                break;
            case 3:
                // Generate random radii for an oval
                int hRadius = rand.nextInt(100) + 1;  // Random horizontal radius between 1 and 100
                int vRadius = rand.nextInt(100) + 1;  // Random vertical radius between 1 and 100
                shape = new COval(hRadius, vRadius);
                break;
        }

        if (shape != null) {
            String shapeName = shape.toString(); // Get the string representation of the shape
            // Ensure the shape is unique (not already in the list)
            if (!uniqueShapes.contains(shapeName)) {
                shapes.add(shape); // Add shape to the list if unique
                uniqueShapes.add(shapeName); // Track this shape by adding its shapeName
            }
        }
    }
}

/**
 * Get the total area of all shapes in the canvas.
 * Iterates through all shapes and sums up their areas.
 * @return total area of all shapes.
 */
public double totalArea() {
    double totalArea = 0;
    for (CShape shape : shapes) {
        totalArea += shape.calculateArea(); // Add the area of each shape to total
    }
    return totalArea;
}

/**
 * Display the shapes on the canvas along with their total area.
 * Prints each shape with its details, followed by the total area of all shapes.
 */
public void displayShapes() {
    System.out.println("Canvas has the following random shapes:");
    for (CShape shape : shapes) {
        System.out.println(shape); // Print the string representation of each shape
    }
    System.out.println("Total area of all shapes is: " + String.format("%.2f", totalArea())); // Print the total area
}
 }