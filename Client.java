/* Suppose you have a hierarchy of classes representing different shapes, such as Circle, 
    Rectangle, and Triangle. You want to perform different operations on these shapes, 
    such as calculating their area or perimeter. Instead of adding these operations to the 
    shape classes, you can use the Visitor Pattern to separate them into separate visitor 
    classes.

    The Shape interface defines the accept() method that takes a ShapeVisitor as a parameter.

    Each shape class (Circle, Rectangle, and Triangle) implements the Shape interface and provides 
    its own implementation of the accept() method that calls the corresponding visit() method of 
    the ShapeVisitor.

    The ShapeVisitor interface defines the visit() method for each shape class.

    The AreaCalculator and PerimeterCalculator classes are visitor implementations that calculate the 
    area and perimeter of a shape, respectively. Each implementation provides its own implementation 
    of the visit() method for each shape class.

    
    The `Client` class creates an array of `Shape` objects and passes each object to the 
    `AreaCalculator` and `PerimeterCalculator` visitors. The visitors use the `accept()` method to 
    visit the corresponding shape and calculate its area and perimeter.

    This way, you can add new operations to the shape hierarchy by simply creating a new visitor 
    implementation. The shape classes remain untouched and don't need to know about the new operations.
*/

public class Client {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(5),
            new Rectangle(3, 4),
            new Triangle(5, 3)
        };
    
        AreaCalculator areaCalculator = new AreaCalculator();
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
    
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
            System.out.println("Area of shape: " + areaCalculator.getArea());
    
            shape.accept(perimeterCalculator);
            System.out.println("Perimeter of shape: " + perimeterCalculator.getPerimeter());
        }
    }
}
    

