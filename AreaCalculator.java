public class AreaCalculator implements ShapeVisitor {
    private double area;

    public void visit(Circle circle) {
        area = Math.PI * circle.getRadius() * circle.getRadius();
    }

    public void visit(Rectangle rectangle) {
        area = rectangle.getWidth() * rectangle.getHeight();
    }

    public void visit(Triangle triangle) {
        area = 0.5 * triangle.getBase() * triangle.getHeight();
    }

    public double getArea() {
        return area;
    }
}
