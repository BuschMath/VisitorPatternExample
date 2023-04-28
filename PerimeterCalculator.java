public class PerimeterCalculator implements ShapeVisitor {
    private double perimeter;

    public void visit(Circle circle) {
        perimeter = 2 * Math.PI * circle.getRadius();
    }

    public void visit(Rectangle rectangle) {
        perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    public void visit(Triangle triangle) {
        perimeter = triangle.getBase() + 2 * Math.sqrt(triangle.getBase() * triangle.getBase() + triangle.getHeight() * triangle.getHeight());
    }

    public double getPerimeter() {
        return perimeter;
    }
}
